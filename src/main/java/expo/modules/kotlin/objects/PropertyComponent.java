package expo.modules.kotlin.objects;

import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.JSTypeConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponent;", "", "", "name", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getter", "setter", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "Ljn0/h0;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getGetter", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getSetter", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PropertyComponent {
    private final SyncFunctionComponent getter;
    private final String name;
    private final SyncFunctionComponent setter;

    public PropertyComponent(String name, SyncFunctionComponent syncFunctionComponent, SyncFunctionComponent syncFunctionComponent2) {
        s.k(name, "name");
        this.name = name;
        this.getter = syncFunctionComponent;
        this.setter = syncFunctionComponent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attachToJSObject$lambda$0(PropertyComponent propertyComponent, AppContext appContext, Object[] args) {
        s.k(args, "args");
        return JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, propertyComponent.getter.callUserImplementation(args, appContext), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attachToJSObject$lambda$1(PropertyComponent propertyComponent, AppContext appContext, Object[] args) {
        s.k(args, "args");
        propertyComponent.setter.callUserImplementation(args, appContext);
        return null;
    }

    public final void attachToJSObject(final AppContext appContext, JSDecoratorsBridgingObject jsObject) {
        ExpectedType[] expectedTypeArr;
        ExpectedType[] expectedTypeArr2;
        List<ExpectedType> cppRequiredTypes$expo_modules_core_release;
        List<ExpectedType> cppRequiredTypes$expo_modules_core_release2;
        s.k(appContext, "appContext");
        s.k(jsObject, "jsObject");
        JNIFunctionBody jNIFunctionBody = this.getter != null ? new JNIFunctionBody() { // from class: expo.modules.kotlin.objects.e
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return PropertyComponent.attachToJSObject$lambda$0(this.f63380a, appContext, objArr);
            }
        } : null;
        JNIFunctionBody jNIFunctionBody2 = this.setter != null ? new JNIFunctionBody() { // from class: expo.modules.kotlin.objects.f
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return PropertyComponent.attachToJSObject$lambda$1(this.f63382a, appContext, objArr);
            }
        } : null;
        String str = this.name;
        SyncFunctionComponent syncFunctionComponent = this.getter;
        boolean z11 = syncFunctionComponent != null && syncFunctionComponent.getTakesOwner$expo_modules_core_release();
        SyncFunctionComponent syncFunctionComponent2 = this.getter;
        if (syncFunctionComponent2 == null || (cppRequiredTypes$expo_modules_core_release2 = syncFunctionComponent2.getCppRequiredTypes$expo_modules_core_release()) == null || (expectedTypeArr = (ExpectedType[]) cppRequiredTypes$expo_modules_core_release2.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr = new ExpectedType[0];
        }
        ExpectedType[] expectedTypeArr3 = expectedTypeArr;
        SyncFunctionComponent syncFunctionComponent3 = this.setter;
        boolean z12 = syncFunctionComponent3 != null && syncFunctionComponent3.getTakesOwner$expo_modules_core_release();
        SyncFunctionComponent syncFunctionComponent4 = this.setter;
        if (syncFunctionComponent4 == null || (cppRequiredTypes$expo_modules_core_release = syncFunctionComponent4.getCppRequiredTypes$expo_modules_core_release()) == null || (expectedTypeArr2 = (ExpectedType[]) cppRequiredTypes$expo_modules_core_release.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr2 = new ExpectedType[0];
        }
        jsObject.registerProperty(str, z11, expectedTypeArr3, jNIFunctionBody, z12, expectedTypeArr2, jNIFunctionBody2);
    }

    public final SyncFunctionComponent getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }

    public final SyncFunctionComponent getSetter() {
        return this.setter;
    }

    public /* synthetic */ PropertyComponent(String str, SyncFunctionComponent syncFunctionComponent, SyncFunctionComponent syncFunctionComponent2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : syncFunctionComponent, (i11 & 4) != 0 ? null : syncFunctionComponent2);
    }
}
