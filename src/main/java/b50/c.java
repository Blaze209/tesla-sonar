package b50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb50/c;", "", "", "routing", "account", "accountConfirm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "c", "", "()Ljava/lang/Integer;", "routingError", "accountError", "accountConfirmError", "", DateTokenConverter.CONVERTER_KEY, "()Z", "isValid", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String routing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String account;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String accountConfirm;

    public c() {
        this(null, null, null, 7, null);
    }

    public final Integer a() {
        String str;
        String str2 = this.account;
        if (str2 == null || (str = this.accountConfirm) == null) {
            return null;
        }
        return i.f16675a.a(str2, str);
    }

    public final Integer b() {
        String str = this.account;
        if (str != null) {
            return i.f16675a.b(str);
        }
        return null;
    }

    public final Integer c() {
        String str = this.routing;
        if (str != null) {
            return i.f16675a.c(str);
        }
        return null;
    }

    public final boolean d() {
        return this.routing != null && this.account != null && this.accountConfirm != null && c() == null && b() == null && a() == null;
    }

    public c(String str, String str2, String str3) {
        this.routing = str;
        this.account = str2;
        this.accountConfirm = str3;
    }

    public /* synthetic */ c(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
