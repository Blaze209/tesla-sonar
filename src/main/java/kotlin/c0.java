package kotlin;

import androidx.collection.i0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p020r2.e3;
import p020r2.m1;
import u1.d;
import u1.e;
import u1.g;
import u1.h;
import u1.i;
import u1.j;
import u1.n;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lb2/c0;", "", "<init>", "()V", "Lu1/j;", "interactionSource", "Ljn0/h0;", "e", "(Lu1/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "I", "Focused", "b", "Hovered", "c", "Pressed", "Lr2/m1;", DateTokenConverter.CONVERTER_KEY, "Lr2/m1;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int Focused = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int Hovered = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int Pressed = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m1 interactionState = e3.a(0);

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0<i> f15422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f15423b;

        a(i0<i> i0Var, c0 c0Var) {
            this.f15422a = i0Var;
            this.f15423b = c0Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i iVar, Continuation<? super h0> continuation) {
            int i11;
            if (iVar instanceof g ? true : iVar instanceof d ? true : iVar instanceof n.b) {
                this.f15422a.g(iVar);
            } else if (iVar instanceof h) {
                this.f15422a.j(((h) iVar).getEnter());
            } else if (iVar instanceof e) {
                this.f15422a.j(((e) iVar).getFocus());
            } else if (iVar instanceof n.c) {
                this.f15422a.j(((n.c) iVar).getPress());
            } else if (iVar instanceof n.a) {
                this.f15422a.j(((n.a) iVar).getPress());
            }
            i0<i> i0Var = this.f15422a;
            c0 c0Var = this.f15423b;
            Object[] objArr = i0Var.content;
            int i12 = i0Var._size;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                i iVar2 = (i) objArr[i14];
                if (iVar2 instanceof g) {
                    i11 = c0Var.Hovered;
                } else if (iVar2 instanceof d) {
                    i11 = c0Var.Focused;
                } else {
                    if (iVar2 instanceof n.b) {
                        i11 = c0Var.Pressed;
                    }
                }
                i13 |= i11;
            }
            this.f15423b.interactionState.a(i13);
            return h0.f84049a;
        }
    }

    public final Object e(j jVar, Continuation<? super h0> continuation) {
        Object objCollect = jVar.c().collect(new a(new i0(0, 1, null), this), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
    }

    public final boolean f() {
        return (this.interactionState.b() & this.Focused) != 0;
    }

    public final boolean g() {
        return (this.interactionState.b() & this.Hovered) != 0;
    }

    public final boolean h() {
        return (this.interactionState.b() & this.Pressed) != 0;
    }
}
