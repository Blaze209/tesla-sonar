package z80;

import android.os.Parcelable;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0018\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lz80/e1;", "Landroid/os/Parcelable;", "<init>", "()V", "Li90/j1;", "sectionFieldElement", "", AnnotatedPrivateKey.LABEL, "Li90/g1;", "a", "(Li90/j1;Ljava/lang/Integer;)Li90/g1;", "", "sectionFieldElements", "b", "(Ljava/util/List;Ljava/lang/Integer;)Li90/g1;", "Companion", "Lz80/a;", "Lz80/d;", "Lz80/g;", "Lz80/i;", "Lz80/l;", "Lz80/n;", "Lz80/o;", "Lz80/x;", "Lz80/n0;", "Lz80/o0;", "Lz80/v0;", "Lz80/x0;", "Lz80/z0;", "Lz80/l1;", "Lz80/n1;", "Lz80/o1;", "Lz80/t1;", "Lz80/v1;", "Lz80/w1;", "Lz80/x1;", "Lz80/y1;", "Lz80/f2;", "Lz80/k2;", "Lz80/n2;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p(with = f1.class)
public abstract class e1 implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z80.e1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/e1$a;", "", "<init>", "()V", "Lro0/d;", "Lz80/e1;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<e1> serializer() {
            return f1.f127458c;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ SectionElement c(e1 e1Var, p010i90.j1 j1Var, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        return e1Var.a(j1Var, num);
    }

    public final SectionElement a(p010i90.j1 sectionFieldElement, Integer label) {
        p013kotlin.jvm.internal.s.k(sectionFieldElement, "sectionFieldElement");
        return SectionElement.INSTANCE.a(sectionFieldElement, label);
    }

    public final SectionElement b(List<? extends p010i90.j1> sectionFieldElements, Integer label) {
        p013kotlin.jvm.internal.s.k(sectionFieldElements, "sectionFieldElements");
        return SectionElement.INSTANCE.b(sectionFieldElements, label);
    }

    private e1() {
    }
}
