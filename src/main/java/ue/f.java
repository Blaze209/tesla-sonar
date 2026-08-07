package ue;

import com.adyen.checkout.cse.EncryptionException;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import te.EncryptedCard;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lue/f;", "Lue/b;", "Lue/c;", "genericEncryptor", "<init>", "(Lue/c;)V", "Lte/c;", "unencryptedCard", "", "publicKey", "Lte/b;", "a", "(Lte/c;Ljava/lang/String;)Lte/b;", "Lue/c;", "b", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c genericEncryptor;

    public f(c genericEncryptor) {
        s.k(genericEncryptor, "genericEncryptor");
        this.genericEncryptor = genericEncryptor;
    }

    @Override // ue.b
    public EncryptedCard a(te.c unencryptedCard, String publicKey) {
        String strA;
        String strA2;
        s.k(unencryptedCard, "unencryptedCard");
        s.k(publicKey, "publicKey");
        try {
            String str = unencryptedCard.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.FloatField.TYPE2 java.lang.String();
            String strA3 = str != null ? this.genericEncryptor.a(InquiryField.FloatField.TYPE2, str, publicKey) : null;
            if (unencryptedCard.getExpiryMonth() != null && unencryptedCard.getExpiryYear() != null) {
                strA = this.genericEncryptor.a("expiryMonth", unencryptedCard.getExpiryMonth(), publicKey);
                strA2 = this.genericEncryptor.a("expiryYear", unencryptedCard.getExpiryYear(), publicKey);
            } else {
                if (unencryptedCard.getExpiryMonth() != null || unencryptedCard.getExpiryYear() != null) {
                    throw new EncryptionException("Both expiryMonth and expiryYear need to be set for encryption.", null);
                }
                strA = null;
                strA2 = null;
            }
            String cvc = unencryptedCard.getCvc();
            return new EncryptedCard(strA3, strA, strA2, cvc != null ? this.genericEncryptor.a("cvc", cvc, publicKey) : null);
        } catch (IllegalStateException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "No message.";
            }
            throw new EncryptionException(message, e11);
        }
    }
}
