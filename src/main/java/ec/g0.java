package ec;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.google.android.gms.actions.SearchIntents;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lec/g0;", "", "", "data", "separator", CardPaymentMethod.PAYMENT_METHOD_TYPE, "authority", "path", SearchIntents.EXTRA_QUERY, "fragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "e", "f", "getQuery", "g", "getFragment", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String separator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String authority;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String query;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    public g0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.data = str;
        this.separator = str2;
        this.scheme = str3;
        this.authority = str4;
        this.path = str5;
        this.query = str6;
        this.fragment = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSeparator() {
        return this.separator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof g0) && p013kotlin.jvm.internal.s.f(((g0) other).data, this.data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getData() {
        return this.data;
    }
}
