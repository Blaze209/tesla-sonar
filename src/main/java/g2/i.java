package g2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import k3.t3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t4.t;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lg2/i;", "", "Lz3/v;", "layoutCoordinates", "Li4/m0;", "textLayoutResult", "<init>", "(Lz3/v;Li4/m0;)V", "", "start", "end", "Lk3/t3;", "e", "(II)Lk3/t3;", "b", "(Lz3/v;Li4/m0;)Lg2/i;", "a", "Lz3/v;", DateTokenConverter.CONVERTER_KEY, "()Lz3/v;", "Li4/m0;", "g", "()Li4/m0;", "", "f", "()Z", "shouldClip", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67092d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i f67093e = new i(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v layoutCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: g2.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg2/i$a;", "", "<init>", "()V", "Lg2/i;", "Empty", "Lg2/i;", "a", "()Lg2/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f67093e;
        }

        private Companion() {
        }
    }

    public i(v vVar, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = vVar;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ i c(i iVar, v vVar, TextLayoutResult textLayoutResult, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            vVar = iVar.layoutCoordinates;
        }
        if ((i11 & 2) != 0) {
            textLayoutResult = iVar.textLayoutResult;
        }
        return iVar.b(vVar, textLayoutResult);
    }

    public final i b(v layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new i(layoutCoordinates, textLayoutResult);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public t3 e(int start, int end) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.z(start, end);
        }
        return null;
    }

    public boolean f() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || t.e(textLayoutResult.getLayoutInput().getOverflow(), t.INSTANCE.c()) || !textLayoutResult.i()) ? false : true;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
