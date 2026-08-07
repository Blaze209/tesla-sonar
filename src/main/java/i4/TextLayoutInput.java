package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i4.l0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b-\u0010=R\u001d\u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b%\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Li4/l0;", "", "Li4/d;", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/w;", "placeholders", "", "maxLines", "", "softWrap", "Lt4/t;", "overflow", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln4/p$b;", "resourceLoader", "Ln4/q$b;", "fontFamilyResolver", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Li4/d;Li4/r0;Ljava/util/List;IZILw4/d;Lw4/t;Ln4/p$b;Ln4/q$b;J)V", "(Li4/d;Li4/r0;Ljava/util/List;IZILw4/d;Lw4/t;Ln4/q$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Li4/d;", "j", "()Li4/d;", "b", "Li4/r0;", IntegerTokenConverter.CONVERTER_KEY, "()Li4/r0;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "I", "e", "Z", "h", "()Z", "f", "Lw4/d;", "()Lw4/d;", "Lw4/t;", "()Lw4/t;", "Ln4/q$b;", "()Ln4/q$b;", "J", "()J", "k", "Ln4/p$b;", "_developerSuppliedResourceLoader", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextLayoutInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final w4.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final w4.t layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final n4.q.b fontFamilyResolver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private n4.p.b _developerSuppliedResourceLoader;

    public /* synthetic */ TextLayoutInput(d dVar, TextStyle r0Var, List list, int i11, boolean z11, int i12, w4.d dVar2, w4.t tVar, n4.q.b bVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, r0Var, list, i11, z11, i12, dVar2, tVar, bVar, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n4.q.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w4.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return p013kotlin.jvm.internal.s.f(this.text, textLayoutInput.text) && p013kotlin.jvm.internal.s.f(this.style, textLayoutInput.style) && p013kotlin.jvm.internal.s.f(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && t4.t.e(this.overflow, textLayoutInput.overflow) && p013kotlin.jvm.internal.s.f(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && p013kotlin.jvm.internal.s.f(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && w4.b.f(this.constraints, textLayoutInput.constraints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<d.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + t4.t.f(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + w4.b.o(this.constraints);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getText() {
        return this.text;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) t4.t.g(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) w4.b.q(this.constraints)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TextLayoutInput(d dVar, TextStyle r0Var, List<d.Range<Placeholder>> list, int i11, boolean z11, int i12, w4.d dVar2, w4.t tVar, n4.p.b bVar, n4.q.b bVar2, long j11) {
        this.text = dVar;
        this.style = r0Var;
        this.placeholders = list;
        this.maxLines = i11;
        this.softWrap = z11;
        this.overflow = i12;
        this.density = dVar2;
        this.layoutDirection = tVar;
        this.fontFamilyResolver = bVar2;
        this.constraints = j11;
        this._developerSuppliedResourceLoader = bVar;
    }

    private TextLayoutInput(d dVar, TextStyle r0Var, List<d.Range<Placeholder>> list, int i11, boolean z11, int i12, w4.d dVar2, w4.t tVar, n4.q.b bVar, long j11) {
        this(dVar, r0Var, list, i11, z11, i12, dVar2, tVar, (n4.p.b) null, bVar, j11);
    }
}
