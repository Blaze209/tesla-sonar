package f30;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lf30/i0;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "WeChatPayV1", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum i0 {
    WeChatPayV1("wechat_pay_beta=v1");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String code;

    i0(String str) {
        this.code = str;
    }

    public static EnumEntries<i0> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }
}
