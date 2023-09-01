package zaggle.xpns.elk.domain.enumeration;

/**
 * The CardStatus enumeration.
 */
public enum CardStatus {
    REGISTERED("Registered"), REGISTER_FAILED("Failed"), ACTIVE("Active"), PENDING("Pending"), BLOCKED("Blocked"),
    LOCKED("Locked");

    private final String value;

    CardStatus(String value) {
	this.value = value;
    }

    public String getValue() {
	return value;
    }
}
