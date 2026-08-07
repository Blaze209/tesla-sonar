package androidx.compose.ui.graphics.painter;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import j3.m;
import k3.d3;
import k3.i3;
import k3.q1;
import m3.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w4.n;
import w4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010&R(\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010-R\u001a\u00100\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010&R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\u0002058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/b;", "Lk3/i3;", "image", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "<init>", "(Lk3/i3;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "(JJ)J", "Lm3/f;", "Ljn0/h0;", "onDraw", "(Lm3/f;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Lk3/q1;", "colorFilter", "applyColorFilter", "(Lk3/q1;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "f", "Lk3/i3;", "g", "J", "h", "Lk3/d3;", IntegerTokenConverter.CONVERTER_KEY, "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "a", "(I)V", "filterQuality", "j", "size", "k", Gender.FEMALE, "l", "Lk3/q1;", "Lj3/m;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BitmapPainter extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final i3 image;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int filterQuality;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private q1 colorFilter;

    public /* synthetic */ BitmapPainter(i3 i3Var, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, j11, j12);
    }

    private final long b(long srcOffset, long srcSize) {
        if (n.h(srcOffset) < 0 || n.i(srcOffset) < 0 || r.g(srcSize) < 0 || r.f(srcSize) < 0 || r.g(srcSize) > this.image.getWidth() || r.f(srcSize) > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return srcSize;
    }

    public final void a(int i11) {
        this.filterQuality = i11;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean applyColorFilter(q1 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return s.f(this.image, bitmapPainter.image) && n.g(this.srcOffset, bitmapPainter.srcOffset) && r.e(this.srcSize, bitmapPainter.srcSize) && d3.d(this.filterQuality, bitmapPainter.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo1getIntrinsicSizeNHjbRc() {
        return w4.s.d(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + n.j(this.srcOffset)) * 31) + r.h(this.srcSize)) * 31) + d3.e(this.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void onDraw(f fVar) {
        f.S1(fVar, this.image, this.srcOffset, this.srcSize, 0L, w4.s.a(Math.round(m.k(fVar.b())), Math.round(m.i(fVar.b()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, null);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) n.m(this.srcOffset)) + ", srcSize=" + ((Object) r.i(this.srcSize)) + ", filterQuality=" + ((Object) d3.f(this.filterQuality)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ BitmapPainter(i3 i3Var, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, (i11 & 2) != 0 ? n.INSTANCE.a() : j11, (i11 & 4) != 0 ? w4.s.a(i3Var.getWidth(), i3Var.getHeight()) : j12, null);
    }

    private BitmapPainter(i3 i3Var, long j11, long j12) {
        this.image = i3Var;
        this.srcOffset = j11;
        this.srcSize = j12;
        this.filterQuality = d3.INSTANCE.a();
        this.size = b(j11, j12);
        this.alpha = 1.0f;
    }
}
