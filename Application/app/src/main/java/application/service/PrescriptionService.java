package application.service;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import application.log.Logging;
import application.requests.PrescriptionRequests;

/**
 * Class that contains API URI for prescription requests
 */
 //Default path
@Path("/prescriptionRequests")
public class PrescriptionService {
    private static final Logger LOGGER = Logging.getInstance();

    /**
     * POST request
     * Gets all prescription entities on the ledger
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/getAllPrescriptions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllPrescriptions(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        return PrescriptionRequests.getAllPrescriptions(userInfo);
    }

    /**
     * POST request
     * Gets all prescriptions for a user from the ledger
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/getPrescriptionsForUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getPrescriptionsForUser(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        return PrescriptionRequests.getAllPrescriptionsForUser(userInfo);
    }

    /**
     * POST request
     * Updates prescription status 
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/updatePrescriptionStatus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updatePrescriptionStatus(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        String PID = requestJson.get("pID").getAsString();
        String status = requestJson.get("status").getAsString();
        return PrescriptionRequests.updateStatus(userInfo, PID, status);
    }

    /**
     * POST request
     * Updates owner of prescription (Transfer)
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/updatePrescriptionOwner")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updatePrescriptionOwner(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        String PID = requestJson.get("pID").getAsString();
        String owner = requestJson.get("owner").getAsString();
        String newOwner = requestJson.get("recipient").getAsString();
        return PrescriptionRequests.transferPrescription(userInfo, PID, owner, newOwner);
    }

    /**
     * POST request
     * Updates the prescription (All details)
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/updatePrescription")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updatePrescription(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        String PID = requestJson.get("pID").getAsString();
        String date = requestJson.get("date").getAsString();
        String issuer = requestJson.get("issuer").getAsString();
        String owner = requestJson.get("owner").getAsString();
        String product = requestJson.get("product").getAsString();
        String productID = requestJson.get("productID").getAsString();
        String productPackage = requestJson.get("productPackage").getAsString();
        String quantity = requestJson.get("quantity").getAsString();
        String doseStrength = requestJson.get("doseStrength").getAsString();
        String doseType = requestJson.get("doseType").getAsString();
        String doseQuantity = requestJson.get("doseQuantity").getAsString();
        String instruction = requestJson.get("instruction").getAsString();
        String comment = requestJson.get("comment").getAsString();
        String status = requestJson.get("status").getAsString();
        return PrescriptionRequests.updatePrescription(userInfo, PID, date, issuer, owner, product, productID, productPackage, quantity, doseStrength, doseType, doseQuantity, instruction, comment, status);
    }

    /**
     * POST request
     * Creates a new prescription on the ledger
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/createPrescription")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createPrescription(String request){
        LOGGER.info(request);
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        String date = requestJson.get("date").getAsString();
        String issuer = requestJson.get("issuer").getAsString();
        String product = requestJson.get("product").getAsString();
        String productID = requestJson.get("productID").getAsString();
        String productPackage = requestJson.get("productPackage").getAsString();
        String quantity = requestJson.get("quantity").getAsString();
        String doseStrength = requestJson.get("doseStrength").getAsString();
        String doseType = requestJson.get("doseType").getAsString();
        String doseQuantity = requestJson.get("doseQuantity").getAsString();
        String instruction = requestJson.get("instruction").getAsString();
        String comment = requestJson.get("comment").getAsString();
        return PrescriptionRequests.createPrescription(userInfo, date, issuer, product, productID, productPackage, quantity, doseStrength, doseType, doseQuantity, instruction, comment);
    }

    /**
     * POST request
     * Gets full prescription history of a prescription on the ledger
     * @param String request(JsonObject)
     * @return MediaType.APPLICATION_JSON (JsonObject.toString())
     */
    @POST
    @Path("/getPrescriptionHistory")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getPrescriptionHistory(String request){
        JsonObject requestJson = (JsonObject) JsonParser.parseString(request).getAsJsonObject();
        JsonObject userInfo = requestJson.get("user").getAsJsonObject();
        return PrescriptionRequests.getPrescriptionHistoryForUser(userInfo);
    }

}
