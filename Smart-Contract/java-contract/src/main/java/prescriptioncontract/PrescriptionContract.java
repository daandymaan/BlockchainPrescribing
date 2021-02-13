package prescriptioncontract;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Objects;

import com.owlike.genson.Genson;

import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.Contact;
import org.hyperledger.fabric.contract.annotation.Contract;
import org.hyperledger.fabric.contract.annotation.Default;
import org.hyperledger.fabric.contract.annotation.Info;
import org.hyperledger.fabric.contract.annotation.License;
import org.hyperledger.fabric.contract.annotation.Transaction;
import org.hyperledger.fabric.shim.ChaincodeStub;
// import org.hyperledger.fabric.shim.ledger.KeyValue;
// import org.hyperledger.fabric.shim.ledger.QueryResultsIterator;

@Contract(
        name = "pc",
        info = @Info(
                title = "Asset Transfer",
                description = "The hyperlegendary asset transfer",
                version = "0.0.1-SNAPSHOT",
                license = @License(
                        name = "Apache 2.0 License",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"),
                contact = @Contact(
                        email = "a.transfer@example.com",
                        name = "Adrian Transfer",
                        url = "https://hyperledger.example.com")))
@Default
public final class PrescriptionContract implements ContractInterface {
    private final Genson genson = new Genson();



    public String generatePID(String date, String issuer, String product, String productID){
        return Integer.toString(Objects.hash(date, issuer, productID));
    }

    /**
     * Issue a prescription, creates a new prescription to be used by a GP
     * String date, String issuer, String owner, String product, String productID, String productPackage, String quantity, String doseStrength, String doseType, String doseQuantity, String instruction, String comment
     * @param {Context} ctx the transaction context
     * @param {String} date of when the prescription was issued
     * @param {String} issuer of the prescription (e.g. GP)
     * @param {String} Medical product title  
     * @param {String} Product ID which relates to the medicine 
     * @param {String} Quantity of the product needed to complete prescription
     * @param {String} Dose strength (e.g. 200mg)
     * @param {String} Dose quantity how many insances of the medical product 
     * @param {String} Instruction in how to consume the medication
     * @param {String} Comments in addition to the instructions
     */
    @Transaction(intent = Transaction.TYPE.SUBMIT)
    public Prescription issue(final Context ctx, String date, String issuer, String product, String productID, String productPackage, String quantity, String doseStrength, String doseType, String doseQuantity, String instruction, String comment){
        ChaincodeStub stub = ctx.getStub();
        String PID = generatePID(date, issuer, product, productID);
        //Create instance of prescription
        Prescription prescription = new Prescription(PID, date, issuer, "", product, productID, productPackage, quantity, doseStrength, doseType, doseQuantity, instruction, comment, "");
        //Prescription is owned by the issuer
        prescription.setOwner(issuer);
        System.out.println(prescription.toString());
        String JSON = genson.serialize(prescription);
        stub.putStringState(PID, JSON);
        return prescription;
    }

    @Transaction(intent = Transaction.TYPE.EVALUATE)
    public String GetAllAssets(final Context ctx){
        // ChaincodeStub stub = ctx.getStub();
        // List<Prescription> queryResults = new ArrayList<Prescription>();
        // QueryResultsIterator<KeyValue> results = stub.getStateByRange("", "");
        
        // for (KeyValue result: results) {
        //     Prescription prescription = genson.deserialize(result.getStringValue(), Prescription.class);
        //     queryResults.add(prescription);
        //     System.out.println(prescription.toString());
        // }

        // final String response = genson.serialize(queryResults);
        String cheese = "This is the new contract";

        return cheese;
    }
}
