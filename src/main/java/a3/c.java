package a3;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.r2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"La3/c;", "T", "La3/l;", "Lr2/r2;", "La3/j;", "", "saver", "La3/g;", "registry", "", Action.KEY_ATTRIBUTE, "value", "", "inputs", "<init>", "(La3/j;La3/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "Ljn0/h0;", "e", "()V", "f", "", "a", "(Ljava/lang/Object;)Z", "onRemembered", "onForgotten", "onAbandoned", DateTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;)Ljava/lang/Object;", "La3/j;", "b", "La3/g;", "c", "Ljava/lang/String;", "Ljava/lang/Object;", "[Ljava/lang/Object;", "La3/g$a;", "La3/g$a;", "entry", "Lkotlin/Function0;", "g", "Lwn0/a;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c<T> implements l, r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j<T, Object> saver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g registry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] inputs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private g.a entry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Object> valueProvider = new a(this);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f71c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar) {
            super(0);
            this.f71c = cVar;
        }

        @Override // wn0.a
        public final Object invoke() {
            j jVar = ((c) this.f71c).saver;
            c<T> cVar = this.f71c;
            Object obj = ((c) cVar).value;
            if (obj != null) {
                return jVar.b(cVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public c(j<T, Object> jVar, g gVar, String str, T t11, Object[] objArr) {
        this.saver = jVar;
        this.registry = gVar;
        this.key = str;
        this.value = t11;
        this.inputs = objArr;
    }

    private final void e() {
        g gVar = this.registry;
        if (this.entry == null) {
            if (gVar != null) {
                b.d(gVar, this.valueProvider.invoke());
                this.entry = gVar.b(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // a3.l
    public boolean a(Object value) {
        g gVar = this.registry;
        return gVar == null || gVar.a(value);
    }

    public final T d(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    public final void f(j<T, Object> saver, g registry, String key, T value, Object[] inputs) {
        boolean z11;
        boolean z12 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z11 = true;
        } else {
            z11 = false;
        }
        if (s.f(this.key, key)) {
            z12 = z11;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        g.a aVar = this.entry;
        if (aVar == null || !z12) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.entry = null;
        e();
    }

    @Override // p020r2.r2
    public void onAbandoned() {
        g.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p020r2.r2
    public void onForgotten() {
        g.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p020r2.r2
    public void onRemembered() {
        e();
    }
}
