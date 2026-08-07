package expo.modules.kotlin.objects;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "R", "Lkotlin/Function0;", "body", "get", "(Lwn0/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Lexpo/modules/kotlin/objects/ConstantComponent;", "build", "()Lexpo/modules/kotlin/objects/ConstantComponent;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getter", "Lwn0/a;", "getGetter", "()Lwn0/a;", "setGetter", "(Lwn0/a;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ConstantComponentBuilder {
    private wn0.a<? extends Object> getter;
    private final String name;

    public ConstantComponentBuilder(String name) {
        s.k(name, "name");
        this.name = name;
    }

    public final ConstantComponent build() {
        String str = this.name;
        wn0.a<? extends Object> aVar = this.getter;
        if (aVar != null) {
            return new ConstantComponent(str, aVar);
        }
        throw new IllegalArgumentException(("The constant '" + str + "' doesn't have getter.").toString());
    }

    public final /* synthetic */ <R> ConstantComponentBuilder get(final wn0.a<? extends R> body) {
        s.k(body, "body");
        s.p();
        setGetter(new wn0.a<R>() { // from class: expo.modules.kotlin.objects.ConstantComponentBuilder$get$1$1
            @Override // wn0.a
            public final R invoke() {
                return body.invoke();
            }
        });
        return this;
    }

    public final wn0.a<Object> getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }

    public final void setGetter(wn0.a<? extends Object> aVar) {
        this.getter = aVar;
    }
}
