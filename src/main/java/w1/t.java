package w1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001d\u0010#\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lw1/t;", "Lx1/a0;", "Lw1/s;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "isVertical", "Lw1/l;", "itemProvider", "Lx1/x;", "measureScope", "<init>", "(JZLw1/l;Lx1/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "c", "(IIIJ)Lw1/s;", DateTokenConverter.CONVERTER_KEY, "(IJ)Lw1/s;", "", Action.KEY_ATTRIBUTE, CMSAttributeTableGenerator.CONTENT_TYPE, "", "Lz3/w0;", "placeables", "b", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lw1/s;", "a", "Lw1/l;", "Lx1/x;", "J", "f", "()J", "childConstraints", "Landroidx/compose/foundation/lazy/layout/c;", "g", "()Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class t implements p024x1.a0<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l itemProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p024x1.x measureScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ t(long j11, boolean z11, l lVar, p024x1.x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, lVar, xVar);
    }

    public static /* synthetic */ s e(t tVar, int i11, long j11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i12 & 2) != 0) {
            j11 = tVar.childConstraints;
        }
        return tVar.d(i11, j11);
    }

    public abstract s b(int index, Object key, Object contentType, List<? extends w0> placeables, long constraints);

    @Override // p024x1.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s a(int index, int lane, int span, long constraints) {
        return d(index, constraints);
    }

    public final s d(int index, long constraints) {
        return b(index, this.itemProvider.c(index), this.itemProvider.d(index), this.measureScope.c0(index, constraints), constraints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    public final androidx.compose.foundation.lazy.layout.c g() {
        return this.itemProvider.e();
    }

    private t(long j11, boolean z11, l lVar, p024x1.x xVar) {
        this.itemProvider = lVar;
        this.measureScope = xVar;
        this.childConstraints = w4.c.b(0, z11 ? w4.b.l(j11) : Integer.MAX_VALUE, 0, z11 ? Integer.MAX_VALUE : w4.b.k(j11), 5, null);
    }
}
