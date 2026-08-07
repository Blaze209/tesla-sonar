package androidx.compose.ui.platform;

import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Ld3/g;", "<init>", "()V", "", "<set-?>", "a", "Lr2/l1;", "t", "()F", "(F)V", "scaleFactor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class v1 implements d3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p020r2.l1 scaleFactor = p020r2.b2.a(1.0f);

    public void a(float f11) {
        this.scaleFactor.r(f11);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, wn0.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) d3.g.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) d3.g.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return d3.g.a.c(this, key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return d3.g.a.d(this, coroutineContext);
    }

    @Override // d3.g
    public float t() {
        return this.scaleFactor.d();
    }
}
