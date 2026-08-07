package androidx.compose.ui.platform;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/d1;", "La3/g;", "saveableStateRegistry", "Lkotlin/Function0;", "Ljn0/h0;", "onDispose", "<init>", "(La3/g;Lwn0/a;)V", "", "value", "", "a", "(Ljava/lang/Object;)Z", "", Action.KEY_ATTRIBUTE, "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "c", "()Ljava/util/Map;", "valueProvider", "La3/g$a;", "b", "(Ljava/lang/String;Lwn0/a;)La3/g$a;", DateTokenConverter.CONVERTER_KEY, "()V", "Lwn0/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d1 implements a3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onDispose;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a3.g f5679b;

    public d1(a3.g gVar, wn0.a<jn0.h0> aVar) {
        this.onDispose = aVar;
        this.f5679b = gVar;
    }

    @Override // a3.g
    public boolean a(Object value) {
        return this.f5679b.a(value);
    }

    @Override // a3.g
    public a3.g.a b(String key, wn0.a<? extends Object> valueProvider) {
        return this.f5679b.b(key, valueProvider);
    }

    @Override // a3.g
    public Map<String, List<Object>> c() {
        return this.f5679b.c();
    }

    public final void d() {
        this.onDispose.invoke();
    }

    @Override // a3.g
    public Object f(String key) {
        return this.f5679b.f(key);
    }
}
