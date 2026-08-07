package t60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.StripeIntent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import sn0.r;
import z80.SharedDataSpec;
import z80.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt60/d;", "", "<init>", "()V", "", "Lz80/g2;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "Ljava/io/InputStream;", "inputStream", "c", "(Ljava/io/InputStream;)Ljava/util/List;", "", "a", "(Ljava/io/InputStream;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "serverLpmSpecs", "Lt60/d$a;", "b", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lt60/d$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: t60.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\f¨\u0006\u001b"}, d2 = {"Lt60/d$a;", "", "", "Lz80/g2;", "sharedDataSpecs", "", "failedToParseServerResponse", "", "failedToParseServerErrorMessage", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "()Z", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SharedDataSpec> sharedDataSpecs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean failedToParseServerResponse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String failedToParseServerErrorMessage;

        public Result(List<SharedDataSpec> sharedDataSpecs, boolean z11, String str) {
            s.k(sharedDataSpecs, "sharedDataSpecs");
            this.sharedDataSpecs = sharedDataSpecs;
            this.failedToParseServerResponse = z11;
            this.failedToParseServerErrorMessage = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFailedToParseServerErrorMessage() {
            return this.failedToParseServerErrorMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFailedToParseServerResponse() {
            return this.failedToParseServerResponse;
        }

        public final List<SharedDataSpec> c() {
            return this.sharedDataSpecs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return s.f(this.sharedDataSpecs, result.sharedDataSpecs) && this.failedToParseServerResponse == result.failedToParseServerResponse && s.f(this.failedToParseServerErrorMessage, result.failedToParseServerErrorMessage);
        }

        public int hashCode() {
            int iHashCode = ((this.sharedDataSpecs.hashCode() * 31) + Boolean.hashCode(this.failedToParseServerResponse)) * 31;
            String str = this.failedToParseServerErrorMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Result(sharedDataSpecs=" + this.sharedDataSpecs + ", failedToParseServerResponse=" + this.failedToParseServerResponse + ", failedToParseServerErrorMessage=" + this.failedToParseServerErrorMessage + ")";
        }
    }

    private final String a(InputStream inputStream) {
        String strF;
        BufferedReader bufferedReader = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream, p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked) : null;
        if (bufferedReader != null) {
            try {
                strF = r.f(bufferedReader);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } else {
            strF = null;
        }
        sn0.b.a(bufferedReader, null);
        return strF;
    }

    private final List<SharedDataSpec> c(InputStream inputStream) {
        List<SharedDataSpec> list;
        String strA = a(inputStream);
        if (strA != null) {
            Object objA = r1.f127742a.a(strA);
            if (jn0.s.e(objA) != null) {
                objA = v.m();
            }
            list = (List) objA;
        } else {
            list = null;
        }
        return list == null ? v.m() : list;
    }

    private final List<SharedDataSpec> d() {
        ClassLoader classLoader = d.class.getClassLoader();
        s.h(classLoader);
        return c(classLoader.getResourceAsStream("lpms.json"));
    }

    public final Result b(StripeIntent stripeIntent, String serverLpmSpecs) {
        boolean zG;
        s.k(stripeIntent, "stripeIntent");
        List<String> listT = stripeIntent.t();
        ArrayList arrayList = new ArrayList();
        String message = null;
        if (serverLpmSpecs == null || serverLpmSpecs.length() == 0) {
            zG = false;
        } else {
            Object objA = r1.f127742a.a(serverLpmSpecs);
            zG = jn0.s.g(objA);
            Throwable thE = jn0.s.e(objA);
            message = thE != null ? thE.getMessage() : null;
            if (jn0.s.e(objA) != null) {
                objA = v.m();
            }
            v.E(arrayList, (Iterable) objA);
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SharedDataSpec) it.next()).getType());
        }
        Set setR1 = v.r1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listT) {
            if (!setR1.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            List<SharedDataSpec> listD = d();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listD) {
                if (arrayList3.contains(((SharedDataSpec) obj2).getType())) {
                    arrayList4.add(obj2);
                }
            }
            v.E(arrayList, arrayList4);
        }
        return new Result(arrayList, zG, message);
    }
}
