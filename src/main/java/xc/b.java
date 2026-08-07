package xc;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.n;
import ec.u;
import gc.h;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import rc.ErrorResult;
import rc.SuccessResult;
import rc.j;
import sc.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxc/b;", "Lxc/d;", "Lxc/e;", "target", "Lrc/j;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lxc/e;Lrc/j;IZ)V", "Ljn0/h0;", "a", "()V", "Lxc/e;", "b", "Lrc/j;", "c", "I", "getDurationMillis", "()I", DateTokenConverter.CONVERTER_KEY, "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    public b(e eVar, j jVar, int i11, boolean z11) {
        this.target = eVar;
        this.result = jVar;
        this.durationMillis = i11;
        this.preferExactIntrinsicSize = z11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // xc.d
    public void a() {
        Drawable drawableA = this.target.a();
        n image = this.result.getImage();
        Drawable drawableA2 = image != null ? u.a(image, this.target.getView().getResources()) : null;
        f scale = this.result.getRequest().getScale();
        int i11 = this.durationMillis;
        j jVar = this.result;
        xc.a aVar = new xc.a(drawableA, drawableA2, scale, i11, ((jVar instanceof SuccessResult) && ((SuccessResult) jVar).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        j jVar2 = this.result;
        if (jVar2 instanceof SuccessResult) {
            this.target.b(u.c(aVar));
        } else {
            if (!(jVar2 instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(u.c(aVar));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lxc/b$a;", "Lxc/d$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lxc/e;", "target", "Lrc/j;", "result", "Lxc/d;", "a", "(Lxc/e;Lrc/j;)Lxc/d;", "c", "I", "getDurationMillis", "()I", DateTokenConverter.CONVERTER_KEY, "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int durationMillis;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean preferExactIntrinsicSize;

        public a(int i11, boolean z11) {
            this.durationMillis = i11;
            this.preferExactIntrinsicSize = z11;
            if (i11 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // xc.d.a
        public d a(e target, j result) {
            if (result instanceof SuccessResult) {
                return ((SuccessResult) result).getDataSource() == h.MEMORY_CACHE ? d.a.f123221b.a(target, result) : new b(target, result, this.durationMillis, this.preferExactIntrinsicSize);
            }
            return d.a.f123221b.a(target, result);
        }

        public /* synthetic */ a(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 200 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }
}
