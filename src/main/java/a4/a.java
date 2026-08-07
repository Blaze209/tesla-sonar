package a4;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"La4/a;", "La4/g;", "La4/j;", "element", "<init>", "(La4/j;)V", "T", "La4/c;", Action.KEY_ATTRIBUTE, "b", "(La4/c;)Ljava/lang/Object;", "", "a", "(La4/c;)Z", "La4/j;", "getElement", "()La4/j;", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j<?> element;

    public a(j<?> jVar) {
        super(null);
        this.element = jVar;
    }

    @Override // a4.g
    public boolean a(c<?> key) {
        return key == this.element.getKey();
    }

    @Override // a4.g
    public <T> T b(c<T> key) {
        if (!(key == this.element.getKey())) {
            y3.a.b("Check failed.");
        }
        return (T) this.element.getValue();
    }

    public final void c(j<?> jVar) {
        this.element = jVar;
    }
}
