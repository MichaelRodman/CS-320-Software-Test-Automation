package contactservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }
    
    @Test
    void testContactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main Street");
        });
    }
    
    @Test
    void testContactIdCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main Street");
        });
    }
    
    @Test
    void testFirstNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Doe", "1234567890", "123 Main Street");
        });
    }
    @Test
    void testFirstNameCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "ABCDEFGHIJK", "Doe", "1234567890", "123 Main Street");
        });
    }
    
    @Test
    void testLastNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", null, "1234567890", "123 Main Street");
        });
    }
    
    @Test
    void testLastNameCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "abcdefghijkl", "1234567890", "123 Main Street");
        });
    }
    
    @Test
    void testPhoneCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", null, "123 Main Street");
        });
    }
    
    @Test
    void testPhoneMustBeExactly10DigitsTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "123456789", "123 Main Street");
        });
    }
    
    @Test
    void testPhoneMustBeExactly10DigitsTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "12345678901", "123 Main Street");
        });
    }
    
    @Test
    void testPhoneMustContainOnlyDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "12345abcde", "123 Main Street");
        });
    }
    @Test
    void testAddressCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", null);
        });
    }
    
    @Test
    void testAddressCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", "1234567890123456789012345678901");
        });
    }
    
    @Test
    void testUpdateContactFields() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");

        contact.setFirstName("Jane");
        contact.setLastName("Smith");
        contact.setPhone("0987654321");
        contact.setAddress("456 Oak Street");

        assertEquals("Jane", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Oak Street", contact.getAddress());
    }
    
    @Test
    void testSetFirstNameCannotBeNull() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
    }
    
    @Test
    void testSetPhoneMustBeExactly10Digits() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("1234");
        });
    }
}