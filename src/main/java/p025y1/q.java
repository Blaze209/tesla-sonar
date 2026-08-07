package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p021s1.u;
import p021s1.x;
import p024x1.h;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly1/c0;", "state", "Lx1/h;", "a", "(Ly1/c0;)Lx1/h;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0011\u001a\u00020\u00062\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, d2 = {"y1/q$a", "Lx1/h;", "Ls1/u;", "", "index", "scrollOffset", "Ljn0/h0;", "b", "(Ls1/u;II)V", "targetIndex", "", "f", "(I)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "()I", "visibleItemsAverageSize", DateTokenConverter.CONVERTER_KEY, "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "e", "lastVisibleItemIndex", "a", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f124576a;

        a(c0 c0Var) {
            this.f124576a = c0Var;
        }

        private final int h() {
            return this.f124576a.G() + this.f124576a.I();
        }

        @Override // p024x1.h
        public int a() {
            return this.f124576a.F();
        }

        @Override // p024x1.h
        public void b(u uVar, int i11, int i12) {
            this.f124576a.j0(i11, i12 / this.f124576a.H(), true);
        }

        @Override // p024x1.h
        public Object c(p<? super u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
            Object objF = x.f(this.f124576a, null, pVar, continuation, 1, null);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
        }

        @Override // p024x1.h
        public int d() {
            return this.f124576a.getFirstVisiblePage();
        }

        @Override // p024x1.h
        public int e() {
            return ((f) v.A0(this.f124576a.C().l())).getIndex();
        }

        @Override // p024x1.h
        public float f(int targetIndex) {
            f fVar;
            List<f> listL = this.f124576a.C().l();
            int size = listL.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    fVar = null;
                    break;
                }
                fVar = listL.get(i11);
                if (fVar.getIndex() == targetIndex) {
                    break;
                }
                i11++;
            }
            f fVar2 = fVar;
            return fVar2 == null ? ((targetIndex - this.f124576a.v()) * h()) - (this.f124576a.w() * this.f124576a.H()) : fVar2.getOffset();
        }

        @Override // p024x1.h
        public int g() {
            return this.f124576a.getFirstVisiblePageOffset();
        }
    }

    public static final h a(c0 c0Var) {
        return new a(c0Var);
    }
}
