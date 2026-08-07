package p023w50;

import androidx.compose.foundation.layout.t;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.l;
import p020r2.o;
import v1.y;
import w4.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00078&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Lw50/e;", "", "<init>", "()V", "Lv1/y;", "b", "(Lr2/l;I)Lv1/y;", "Lw4/h;", "a", "()F", "radius", "Lw50/e$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lw50/e$a;", "Lw50/e;", "<init>", "()V", "Lv1/y;", "b", "(Lr2/l;I)Lv1/y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw4/h;", Gender.FEMALE, "a", "()F", "radius", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f120920a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final float radius = h.g(12);

        private a() {
            super(null);
        }

        @Override // p023w50.e
        public float a() {
            return radius;
        }

        @Override // p023w50.e
        public y b(l lVar, int i11) {
            lVar.H(-982635024);
            if (o.J()) {
                o.S(-982635024, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size.Regular.paddingValues (Button.kt:216)");
            }
            float f11 = 16;
            y yVarD = t.d(h.g(f11), h.g(f11), h.g(f11), h.g(f11));
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return yVarD;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 539612306;
        }

        public String toString() {
            return "Regular";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float a();

    public abstract y b(l lVar, int i11);

    private e() {
    }
}
