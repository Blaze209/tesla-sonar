package i80;

import co0.m;
import com.fourthline.adapters.serialization.OrcaKeys;
import g4.o;
import g4.x;
import g4.y;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.z;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"3\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00018@@@X\u0080\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0007\u0010\f\"\u0004\b\r\u0010\u000e*\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/d;", "", OrcaKeys.METADATA, "b", "(Landroidx/compose/ui/d;Ljava/lang/String;)Landroidx/compose/ui/d;", "Lg4/x;", "Lg4/x;", "getTestMetadata", "()Lg4/x;", "TestMetadata", "Lg4/y;", "<set-?>", "(Lg4/y;)Ljava/lang/String;", "a", "(Lg4/y;Ljava/lang/String;)V", "getTestMetadata$delegate", "(Lg4/y;)Ljava/lang/Object;", "testMetadata", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f76223a = {o0.f(new z(e.class, "testMetadata", "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x<String> f76224b = new x<>("TestMetadata", a.f76225c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f76226c = str;
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            e.a(semantics, this.f76226c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    public static final void a(y yVar, String str) {
        s.k(yVar, "<this>");
        f76224b.d(yVar, f76223a[0], str);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, String str) {
        s.k(dVar, "<this>");
        return o.d(dVar, false, new b(str), 1, null);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<String, String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f76225c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }
}
