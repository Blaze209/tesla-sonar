package u80;

import com.google.android.gms.wallet.WalletConstants;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lu80/b;", "", "", "code", "", "description", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getCode", "()I", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "InvalidMessageReceived", "UnsupportedMessageVersion", "RequiredDataElementMissing", "UnrecognizedCriticalMessageExtensions", "InvalidDataElementFormat", "InvalidTransactionId", "DataDecryptionFailure", "TransactionTimedout", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum b {
    InvalidMessageReceived(101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes"),
    UnsupportedMessageVersion(102, "Message Version Number received is not valid for the receiving component."),
    RequiredDataElementMissing(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, "A message element required as defined in Table A.1 is missing from the message."),
    UnrecognizedCriticalMessageExtensions(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, "Critical message extension not recognised."),
    InvalidDataElementFormat(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Data element not in the required format or value is invalid as defined in Table A.1"),
    InvalidTransactionId(EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Transaction ID received is not valid for the receiving component."),
    DataDecryptionFailure(EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Data could not be decrypted by the receiving system due to technical or other reason."),
    TransactionTimedout(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, "Transaction timed-out.");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int code;
    private final String description;

    b(int i11, String str) {
        this.code = i11;
        this.description = str;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
