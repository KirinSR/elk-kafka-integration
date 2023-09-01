package zaggle.xpns.elk.service.dto;

import lombok.*;
import org.joda.time.Instant;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CardTxnApiDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**     * M2P’s transaction reference id     */

    private String txnRef;
    private String cardRefNo;
    private String cardKitNo;
    private String mobileNo;
    private String cardType;
    private String merchantLocation;
    private String channel;
    private String txnCurrency;
    private String acquirerId;
    private String network;
    private String billingCurrency;
    private String accqInstitutionCode;
    private String corporate;

    /**     * Transaction amount     */
    private Double amount;
    /**     * Available balance in card     */
    private Double balance;
    /**     * Transaction type     */
    private String transactionType;
    /**     * Credit or Debit     */
    private String type;
    /**     * Transaction timestamp     */
    private Long txnTime;
    /**     * Beneficiary’s name     */
    private String beneficiaryName;
    /**     * Beneficiary’s type     */
    private String beneficiaryType;
    /**     * Beneficiary’s entity id     */
    private String beneficiaryId;
    /**     * Transaction description     */
    private String description;
    /**     * Transaction channel (Ex: Mobile, Web etc)     */
    private String txnOrigin;
    /**     * Beneficiary’s Name     */
    private String otherPartyName;
    /**     * Beneficiary’s Id     */
    private String otherPartyId;
    /**     * Transaction status     */
    private String transactionStatus;
    /**     * Customer’s wallet name     */
    private String customerWallet;
    /**     * Beneficiary’s wallet name     */
    private String beneficiaryWallet;
    /**     * Customer’s unique external Transaction Id     */
    private String externalTransactionId;
    /**     * Customer’s retrieval reference Number     */
    private String retrivalReferenceNo;
    /**     * Customer’s authorization Code     */
    private String authCode;
    /**     * Customer’s bill reference Number     */
    private String billRefNo;
    /**     * Customer’s Bank Transaction Id     */
    private String bankTid;
    private Instant createdDt;
    private String createdBy;
    private String updatedBy;
    private Instant updatedDt;
    private Long cardTransactionsAddnInfoId;

}
