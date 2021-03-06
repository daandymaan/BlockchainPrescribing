package prescriptioncontract;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONObject;


public class PrescriptionTest {
    
    @Test
    public void isReflexive() {
        Prescription prescription = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");

        assertThat(prescription).isEqualTo(prescription);
    }

    @Test
    public void handlesInequality() {
        Prescription prescriptionA = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");
        Prescription prescriptionB = new Prescription("002",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "PREDFOAM",
        "G33387",
        "",
        "14",
        "25G",
        "CANISTER",
        "14",
        "ONE APPLICANCE DAILY",
        "",
        "ACTIVE");

        assertThat(prescriptionA).isNotEqualTo(prescriptionB);
    }

    @Test
    public void handlesOtherObjects() {
        Prescription prescriptionA = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");
        String prescriptionB = "not a prescription";

        assertThat(prescriptionA).isNotEqualTo(prescriptionB);
    }

    @Test
    public void handlesNull() {
        Prescription prescription = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");

        assertThat(prescription).isNotEqualTo(null);
    }

    @Test
    public void handlesDeserialization(){
        Prescription prescription = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");

        JSONObject prescriptionJson = new JSONObject();
        prescriptionJson.put("pID", "001");
        prescriptionJson.put("date", "31-03-2021 12-27-00");
        prescriptionJson.put("issuer", "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----");
        prescriptionJson.put("owner", "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----");
        prescriptionJson.put("product", "ASACOLON");
        prescriptionJson.put("productID", "G13072");
        prescriptionJson.put("productPackage", "");
        prescriptionJson.put("quantity", "28");
        prescriptionJson.put("doseStrength", "400MG");
        prescriptionJson.put("doseType", "TABS");
        prescriptionJson.put("doseQuantity", "28");
        prescriptionJson.put("instruction", "TAKE TWO TWICE DAILY");
        prescriptionJson.put("comment", "");
        prescriptionJson.put("status", "ACTIVE");

        Prescription stringToPrescription = Prescription.deserialize(prescriptionJson.toString());
        assertThat(prescription).isEqualToComparingFieldByField(stringToPrescription);
    }

    @Test
    public void handlesSerialization(){
        Prescription prescription = new Prescription("001",
        "31-03-2021 12-27-00", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "-----BEGINCERTIFICATE-----MIICgzCCAiqgAwIBAgIUM5+j+ONg63n6zkHn4uAK9rIqGRswCgYIKoZIzj0EAwIwcDELMAkGA1UEBhMCVVMxFzAVBgNVBAgTDk5vcnRoIENhcm9saW5hMQ8wDQYDVQQHEwZEdXJoYW0xGTAXBgNVBAoTEG9yZzEuZXhhbXBsZS5jb20xHDAaBgNVBAMTE2NhLm9yZzEuZXhhbXBsZS5jb20wHhcNMjEwMjEyMTk1NzAwWhcNMjIwMjEyMjAwMjAwWjBEMTAwDQYDVQQLEwZjbGllbnQwCwYDVQQLEwRvcmcxMBIGA1UECxMLZGVwYXJ0bWVudDExEDAOBgNVBAMTB2FwcFVzZXIwWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAASJHI1gh/i7Z8TiCS/9jldWH/EZ0aj9mdyo7gB20xQ2eANllCRNRKaPtjVYqcZCi6LPiz/UuMZssYR83tZYmknEo4HNMIHKMA4GA1UdDwEB/wQEAwIHgDAMBgNVHRMBAf8EAjAAMB0GA1UdDgQWBBQiP1+bIKJXSN8wXEEtCy4Kd2C6GzAfBgNVHSMEGDAWgBQm/W4Zql66TuJXCEcO9b7sLnJ/CjBqBggqAwQFBgcIAQReeyJhdHRycyI6eyJoZi5BZmZpbGlhdGlvbiI6Im9yZzEuZGVwYXJ0bWVudDEiLCJoZi5FbnJvbGxtZW50SUQiOiJhcHBVc2VyIiwiaGYuVHlwZSI6ImNsaWVudCJ9fTAKBggqhkjOPQQDAgNH\nADBEAiAaOwsAAVxtwzAfrYITK1TBqMz6EpWO7adbr0OZa8OjUgIgNiW8974VpeXys2CIrHYF85fIOXQ8A4/RNTOy2EdqMlg=-----ENDCERTIFICATE-----", 
        "ASACOLON",
        "G13072",
        "",
        "28",
        "400MG",
        "TABS",
        "28",
        "TAKE TWO TWICE DAILY",
        "",
        "ACTIVE");

        String prescriptionToString = new String(Prescription.serialize(prescription));
        JSONObject stringToJson = new JSONObject(prescriptionToString);
        assertEquals(prescription.getPID(), stringToJson.getString("PID"));
        assertEquals(prescription.getDate(), stringToJson.getString("date"));
        assertEquals(prescription.getIssuer(), stringToJson.getString("issuer"));
        assertEquals(prescription.getOwner(), stringToJson.getString("owner"));
        assertEquals(prescription.getProduct(), stringToJson.getString("product"));
        assertEquals(prescription.getProductID(), stringToJson.getString("productID"));
        assertEquals(prescription.getProductPackage(), stringToJson.getString("productPackage"));
        assertEquals(prescription.getQuantity(), stringToJson.getString("quantity"));
        assertEquals(prescription.getDoseStrength(), stringToJson.getString("doseStrength"));
        assertEquals(prescription.getDoseType(), stringToJson.getString("doseType"));
        assertEquals(prescription.getDoseQuantity(), stringToJson.getString("doseQuantity"));
        assertEquals(prescription.getInstruction(), stringToJson.getString("instruction"));
        assertEquals(prescription.getComment(), stringToJson.getString("comment"));
        assertEquals(prescription.getStatus(), stringToJson.getString("status"));
    }
     
}
