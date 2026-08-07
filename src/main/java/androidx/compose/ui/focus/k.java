package androidx.compose.ui.focus;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRB\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/k;", "", "", "v", "()Z", "r", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/o;", "<anonymous parameter 0>", "getNext", "()Landroidx/compose/ui/focus/o;", "setNext", "(Landroidx/compose/ui/focus/o;)V", "next", "t", "setPrevious", "previous", "o", "setUp", "up", "q", "setDown", "down", "n", "setLeft", "left", "e", "setRight", "right", "getStart", "setStart", "start", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/d;", "u", "()Lwn0/l;", "s", "(Lwn0/l;)V", "getEnter$annotations", "()V", "enter", "p", "w", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/o;", "a", "(I)Landroidx/compose/ui/focus/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<d, o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5365c = new a();

        a() {
            super(1);
        }

        public final o a(int i11) {
            return o.INSTANCE.b();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ o invoke(d dVar) {
            return a(dVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/o;", "a", "(I)Landroidx/compose/ui/focus/o;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<d, o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5366c = new b();

        b() {
            super(1);
        }

        public final o a(int i11) {
            return o.INSTANCE.b();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ o invoke(d dVar) {
            return a(dVar.getValue());
        }
    }

    default o e() {
        return o.INSTANCE.b();
    }

    default o getEnd() {
        return o.INSTANCE.b();
    }

    default o getNext() {
        return o.INSTANCE.b();
    }

    default o getStart() {
        return o.INSTANCE.b();
    }

    default o n() {
        return o.INSTANCE.b();
    }

    default o o() {
        return o.INSTANCE.b();
    }

    default wn0.l<d, o> p() {
        return b.f5366c;
    }

    default o q() {
        return o.INSTANCE.b();
    }

    void r(boolean z11);

    default o t() {
        return o.INSTANCE.b();
    }

    default wn0.l<d, o> u() {
        return a.f5365c;
    }

    boolean v();

    default void s(wn0.l<? super d, o> lVar) {
    }

    default void w(wn0.l<? super d, o> lVar) {
    }
}
