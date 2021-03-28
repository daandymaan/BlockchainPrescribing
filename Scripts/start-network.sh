#!/bin/bash
#
function _exit(){
    printf "Exiting:%s\n" "$1"
    exit -1
}

#Returns the value of the last pipe which exited
set -o pipefail
#-e = Exits if command has non-zero status
#-v = Displays each command run by bash script
set -ev

#Current directory
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

#Export appropriate enviromental variables 
export PATH=/home/dan/Docs/fabric-samples/bin:$PATH
export FABRIC_CFG_PATH=/home/dan/Docs/fabric-samples/config/
export PATH=$PATH:$FABRIC_CFG_PATH 
export COMPOSE_PROJECT_NAME=net
export IMAGE_TAG=latest
export SYS_CHANNEL=system-channel

#Stop network
./stop-network.sh

#Go to network directory
cd /home/dan/Docs/fabric-samples/test-network

#Creates a network with ca and each have a couchdb
./network.sh up createChannel -ca -s couchdb 

#Copy peer configurations to external folder
cp "/home/dan/Docs/fabric-samples/test-network/organizations/peerOrganizations/org1.example.com/connection-org1.yaml" "/home/dan/Docs/BlockchainPrescribing/Orgs/Org1/gateway/"
cp "/home/dan/Docs/fabric-samples/test-network/organizations/peerOrganizations/org2.example.com/connection-org2.yaml" "/home/dan/Docs/BlockchainPrescribing/Orgs/Org2/gateway/"

cd /home/dan/Docs/BlockchainPrescribing/Scripts

# Run this script to install chaincode
./deployCC.sh infocontract /home/dan/Docs/BlockchainPrescribing/Smart-Contract/info-contract
./deployCC.sh pc /home/dan/Docs/BlockchainPrescribing/Smart-Contract/java-contract