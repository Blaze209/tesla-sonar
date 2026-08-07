package p023w50;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import p009i2.i;
import p009i2.j;
import p009i2.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.l;
import p020r2.o;
import p026y50.d;
import w4.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lw50/f;", "", "<init>", "()V", "Li2/i;", "a", "(Lr2/l;I)Li2/i;", "Li2/k;", "b", "(Lr2/l;I)Li2/k;", "Lw50/f$a;", "Lw50/f$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw50/f$a;", "Lw50/f;", "<init>", "()V", "Li2/i;", "a", "(Lr2/l;I)Li2/i;", "Li2/k;", "b", "(Lr2/l;I)Li2/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f120922a = new a();

        private a() {
            super(null);
        }

        @Override // p023w50.f
        public i a(l lVar, int i11) {
            lVar.H(-585272451);
            if (o.J()) {
                o.S(-585272451, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Primary.buttonColors (Button.kt:171)");
            }
            j jVar = j.f74513a;
            d dVar = d.f125064a;
            i iVarA = jVar.a(dVar.a(lVar, 6).getButtonPrimary(), dVar.a(lVar, 6).getContentOnBrand(), dVar.a(lVar, 6).getButtonPrimary(), p1.p(dVar.a(lVar, 6).getContentOnBrand(), 0.4f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, j.f74524l << 12, 0);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return iVarA;
        }

        @Override // p023w50.f
        public k b(l lVar, int i11) {
            lVar.H(1046173141);
            if (o.J()) {
                o.S(1046173141, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Primary.elevation (Button.kt:181)");
            }
            k kVarB = j.f74513a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVar, j.f74524l << 15, 31);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return kVarB;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1748817615;
        }

        public String toString() {
            return "Primary";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw50/f$b;", "Lw50/f;", "<init>", "()V", "Li2/i;", "a", "(Lr2/l;I)Li2/i;", "Li2/k;", "b", "(Lr2/l;I)Li2/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f120923a = new b();

        private b() {
            super(null);
        }

        @Override // p023w50.f
        public i a(l lVar, int i11) {
            lVar.H(-1339122933);
            if (o.J()) {
                o.S(-1339122933, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Secondary.buttonColors (Button.kt:186)");
            }
            j jVar = j.f74513a;
            long jO = p026y50.a.o();
            d dVar = d.f125064a;
            i iVarA = jVar.a(jO, dVar.a(lVar, 6).getTextDefault(), p026y50.a.o(), p1.p(dVar.a(lVar, 6).getTextDefault(), 0.4f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, (j.f74524l << 12) | 390, 0);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return iVarA;
        }

        @Override // p023w50.f
        public k b(l lVar, int i11) {
            lVar.H(-1182972061);
            if (o.J()) {
                o.S(-1182972061, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Secondary.elevation (Button.kt:196)");
            }
            float f11 = 0;
            k kVarB = j.f74513a.b(h.g(f11), h.g(f11), h.g(f11), h.g(f11), h.g(f11), lVar, (j.f74524l << 15) | 28086, 0);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return kVarB;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -256869149;
        }

        public String toString() {
            return "Secondary";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract i a(l lVar, int i11);

    public abstract k b(l lVar, int i11);

    private f() {
    }
}
