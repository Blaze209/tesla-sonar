package z3;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0013\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lz3/b0;", "Landroidx/compose/ui/d$b;", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b0 extends androidx.compose.ui.d.b {
    default int B(r rVar, q qVar, int i11) {
        return m0.f126778a.d(this, rVar, qVar, i11);
    }

    default int M(r rVar, q qVar, int i11) {
        return m0.f126778a.b(this, rVar, qVar, i11);
    }

    j0 c(k0 k0Var, h0 h0Var, long j11);

    default int n(r rVar, q qVar, int i11) {
        return m0.f126778a.a(this, rVar, qVar, i11);
    }

    default int q(r rVar, q qVar, int i11) {
        return m0.f126778a.c(this, rVar, qVar, i11);
    }
}
