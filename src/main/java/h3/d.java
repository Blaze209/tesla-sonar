package h3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.g3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\nR\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020+8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010,R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lh3/d;", "Lw4/d;", "<init>", "()V", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "block", "Lh3/i;", "n", "(Lwn0/l;)Lh3/i;", "Lm3/c;", "q", "Lh3/b;", "a", "Lh3/b;", "getCacheParams$ui_release", "()Lh3/b;", "y", "(Lh3/b;)V", "cacheParams", "b", "Lh3/i;", "c", "()Lh3/i;", "D", "(Lh3/i;)V", "drawResult", "Lm3/c;", "getContentDrawScope$ui_release", "()Lm3/c;", "B", "(Lm3/c;)V", "contentDrawScope", "Lkotlin/Function0;", "Lk3/g3;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "getGraphicsContextProvider$ui_release", "()Lwn0/a;", Gender.FEMALE, "(Lwn0/a;)V", "graphicsContextProvider", "Lj3/m;", "()J", "size", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "", "getDensity", "()F", "density", "M1", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements w4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b cacheParams = j.f70567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i drawResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m3.c contentDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<? extends g3> graphicsContextProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<m3.c, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<m3.f, h0> f70564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super m3.f, h0> lVar) {
            super(1);
            this.f70564c = lVar;
        }

        public final void a(m3.c cVar) {
            this.f70564c.invoke(cVar);
            cVar.M0();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    public final void B(m3.c cVar) {
        this.contentDrawScope = cVar;
    }

    public final void D(i iVar) {
        this.drawResult = iVar;
    }

    public final void F(wn0.a<? extends g3> aVar) {
        this.graphicsContextProvider = aVar;
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final long b() {
        return this.cacheParams.b();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getDrawResult() {
        return this.drawResult;
    }

    @Override // w4.d
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final i n(wn0.l<? super m3.f, h0> block) {
        return q(new a(block));
    }

    public final i q(wn0.l<? super m3.c, h0> block) {
        i iVar = new i(block);
        this.drawResult = iVar;
        return iVar;
    }

    public final void y(b bVar) {
        this.cacheParams = bVar;
    }
}
