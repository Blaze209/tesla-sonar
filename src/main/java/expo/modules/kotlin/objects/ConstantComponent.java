package expo.modules.kotlin.objects;

import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.JSTypeConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/objects/ConstantComponent;", "", "", "name", "Lkotlin/Function0;", "getter", "<init>", "(Ljava/lang/String;Lwn0/a;)V", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "Ljn0/h0;", "attachToJSObject", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lwn0/a;", "getGetter", "()Lwn0/a;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConstantComponent {
    private final wn0.a<Object> getter;
    private final String name;

    public ConstantComponent(String name, wn0.a<? extends Object> getter) {
        s.k(name, "name");
        s.k(getter, "getter");
        this.name = name;
        this.getter = getter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attachToJSObject$lambda$0(ConstantComponent constantComponent) {
        return JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, constantComponent.getter.invoke(), null, false, 6, null);
    }

    public final void attachToJSObject(JSDecoratorsBridgingObject jsObject) {
        s.k(jsObject, "jsObject");
        jsObject.registerConstant(this.name, new JNINoArgsFunctionBody() { // from class: expo.modules.kotlin.objects.a
            @Override // expo.modules.kotlin.jni.JNINoArgsFunctionBody
            public final Object invoke() {
                return ConstantComponent.attachToJSObject$lambda$0(this.f63376a);
            }
        });
    }

    public final wn0.a<Object> getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }
}
