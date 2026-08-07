package androidx.compose.ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010*\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R\"\u0010.\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R4\u00108\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0003\u001a\u0004\b3\u00104\"\u0004\b5\u00106R4\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b9\u00102\u0012\u0004\b<\u0010\u0003\u001a\u0004\b:\u00104\"\u0004\b;\u00106¨\u0006>"}, d2 = {"Landroidx/compose/ui/focus/l;", "Landroidx/compose/ui/focus/k;", "<init>", "()V", "", "a", "Z", "v", "()Z", "r", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/o;", "b", "Landroidx/compose/ui/focus/o;", "getNext", "()Landroidx/compose/ui/focus/o;", "setNext", "(Landroidx/compose/ui/focus/o;)V", "next", "c", "t", "setPrevious", "previous", DateTokenConverter.CONVERTER_KEY, "o", "setUp", "up", "e", "q", "setDown", "down", "f", "n", "setLeft", "left", "g", "setRight", "right", "h", "getStart", "setStart", "start", IntegerTokenConverter.CONVERTER_KEY, "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/d;", "j", "Lwn0/l;", "u", "()Lwn0/l;", "s", "(Lwn0/l;)V", "getEnter$annotations", "enter", "k", "p", "w", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private o next;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private o previous;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private o up;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private o down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private o left;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private o right;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private o start;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private o end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super d, o> enter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super d, o> exit;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "Landroidx/compose/ui/focus/o;", "a", "(I)Landroidx/compose/ui/focus/o;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<d, o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5378c = new a();

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
        public static final b f5379c = new b();

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

    public l() {
        o.Companion companion = o.INSTANCE;
        this.next = companion.b();
        this.previous = companion.b();
        this.up = companion.b();
        this.down = companion.b();
        this.left = companion.b();
        this.right = companion.b();
        this.start = companion.b();
        this.end = companion.b();
        this.enter = a.f5378c;
        this.exit = b.f5379c;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: e, reason: from getter */
    public o getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.k
    public o getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.k
    public o getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.k
    public o getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: n, reason: from getter */
    public o getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: o, reason: from getter */
    public o getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.k
    public wn0.l<d, o> p() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: q, reason: from getter */
    public o getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.k
    public void r(boolean z11) {
        this.canFocus = z11;
    }

    @Override // androidx.compose.ui.focus.k
    public void s(wn0.l<? super d, o> lVar) {
        this.enter = lVar;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: t, reason: from getter */
    public o getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.k
    public wn0.l<d, o> u() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.k
    /* JADX INFO: renamed from: v, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.k
    public void w(wn0.l<? super d, o> lVar) {
        this.exit = lVar;
    }
}
