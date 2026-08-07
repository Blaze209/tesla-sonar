package expo.modules.kotlin.functions;

import co0.f;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ReadableArrayIterator;
import expo.modules.kotlin.ReadableArrayIteratorKt;
import expo.modules.kotlin.exception.ArgumentCastException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R(\u0010%\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010.\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010,\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010(¨\u0006<"}, d2 = {"Lexpo/modules/kotlin/functions/AnyFunction;", "", "", "name", "", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "Lcom/facebook/react/bridge/ReadableArray;", "args", "convertArgs", "(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/Object;", "Lexpo/modules/kotlin/AppContext;", "appContext", "([Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)[Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "Ljn0/h0;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes$expo_modules_core_release", "()Ljava/util/List;", "getCppRequiredTypes", "", "isEnumerable", "enumerable", "(Z)Lexpo/modules/kotlin/functions/AnyFunction;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "[Lexpo/modules/kotlin/types/AnyType;", "getDesiredArgsTypes", "()[Lexpo/modules/kotlin/types/AnyType;", "canTakeOwner", "Z", "getCanTakeOwner", "()Z", "setCanTakeOwner", "(Z)V", "getCanTakeOwner$annotations", "()V", "Lco0/q;", "ownerType", "Lco0/q;", "getOwnerType", "()Lco0/q;", "setOwnerType", "(Lco0/q;)V", "getOwnerType$annotations", "isEnumerable$expo_modules_core_release", "setEnumerable$expo_modules_core_release", "", "requiredArgumentsCount", "I", "getTakesOwner$expo_modules_core_release", "takesOwner", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnyFunction {
    private boolean canTakeOwner;
    private final AnyType[] desiredArgsTypes;
    private boolean isEnumerable;
    private final String name;
    private q ownerType;
    private final int requiredArgumentsCount;

    public AnyFunction(String name, AnyType[] desiredArgsTypes) {
        s.k(name, "name");
        s.k(desiredArgsTypes, "desiredArgsTypes");
        this.name = name;
        this.desiredArgsTypes = desiredArgsTypes;
        this.isEnumerable = true;
        Iterator it = n.c1(desiredArgsTypes).iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (!((AnyType) it.next()).getKType().getIsMarkedNullable()) {
                break;
            } else {
                i11++;
            }
        }
        this.requiredArgumentsCount = i11 >= 0 ? this.desiredArgsTypes.length - i11 : 0;
    }

    public static /* synthetic */ Object[] convertArgs$default(AnyFunction anyFunction, Object[] objArr, AppContext appContext, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertArgs");
        }
        if ((i11 & 2) != 0) {
            appContext = null;
        }
        return anyFunction.convertArgs(objArr, appContext);
    }

    public static /* synthetic */ AnyFunction enumerable$default(AnyFunction anyFunction, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enumerable");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return anyFunction.enumerable(z11);
    }

    public static /* synthetic */ void getCanTakeOwner$annotations() {
    }

    public static /* synthetic */ void getOwnerType$annotations() {
    }

    public abstract void attachToJSObject(AppContext appContext, JSDecoratorsBridgingObject jsObject, String moduleName);

    protected final Object[] convertArgs(ReadableArray args) throws InvalidArgsNumberException {
        CodedException unexpectedException;
        s.k(args, "args");
        if (this.requiredArgumentsCount <= args.size()) {
            int size = args.size();
            AnyType[] anyTypeArr = this.desiredArgsTypes;
            if (size <= anyTypeArr.length) {
                int length = anyTypeArr.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    objArr[i11] = null;
                }
                ReadableArrayIterator it = ReadableArrayIteratorKt.iterator(args);
                int size2 = args.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    AnyType anyType = this.desiredArgsTypes[i12];
                    Dynamic next = it.next();
                    try {
                        objArr[i12] = AnyType.convert$default(anyType, next, null, 2, null);
                        h0 h0Var = h0.f84049a;
                        next.recycle();
                    } catch (Throwable th2) {
                        try {
                            if (th2 instanceof CodedException) {
                                unexpectedException = (CodedException) th2;
                            } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                                String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                                s.j(code, "getCode(...)");
                                unexpectedException = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th2);
                            }
                            throw new ArgumentCastException(anyType.getKType(), i12, next.getType().toString(), unexpectedException);
                        } catch (Throwable th3) {
                            next.recycle();
                            throw th3;
                        }
                    }
                }
                return objArr;
            }
        }
        throw new InvalidArgsNumberException(args.size(), this.desiredArgsTypes.length, this.requiredArgumentsCount);
    }

    public final AnyFunction enumerable(boolean isEnumerable) {
        this.isEnumerable = isEnumerable;
        return this;
    }

    public final boolean getCanTakeOwner() {
        return this.canTakeOwner;
    }

    public final List<ExpectedType> getCppRequiredTypes$expo_modules_core_release() {
        AnyType[] anyTypeArr = this.desiredArgsTypes;
        ArrayList arrayList = new ArrayList(anyTypeArr.length);
        for (AnyType anyType : anyTypeArr) {
            arrayList.add(anyType.getCppRequiredTypes());
        }
        return arrayList;
    }

    protected final AnyType[] getDesiredArgsTypes() {
        return this.desiredArgsTypes;
    }

    protected final String getName() {
        return this.name;
    }

    public final q getOwnerType() {
        return this.ownerType;
    }

    public final boolean getTakesOwner$expo_modules_core_release() {
        q kType;
        if (!this.canTakeOwner) {
            return false;
        }
        AnyType anyType = (AnyType) n.l0(this.desiredArgsTypes);
        f classifier = (anyType == null || (kType = anyType.getKType()) == null) ? null : kType.getClassifier();
        co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
        if (dVar == null) {
            return false;
        }
        if (s.f(dVar, o0.b(JavaScriptObject.class))) {
            return true;
        }
        q qVar = this.ownerType;
        f classifier2 = qVar != null ? qVar.getClassifier() : null;
        co0.d dVar2 = classifier2 instanceof co0.d ? (co0.d) classifier2 : null;
        if (dVar2 == null) {
            return false;
        }
        return s.f(dVar, dVar2);
    }

    /* JADX INFO: renamed from: isEnumerable$expo_modules_core_release, reason: from getter */
    public final boolean getIsEnumerable() {
        return this.isEnumerable;
    }

    public final void setCanTakeOwner(boolean z11) {
        this.canTakeOwner = z11;
    }

    public final void setEnumerable$expo_modules_core_release(boolean z11) {
        this.isEnumerable = z11;
    }

    public final void setOwnerType(q qVar) {
        this.ownerType = qVar;
    }

    protected final Object[] convertArgs(Object[] args, AppContext appContext) throws InvalidArgsNumberException, ArgumentCastException {
        CodedException unexpectedException;
        CodedException codedException;
        s.k(args, "args");
        if (this.requiredArgumentsCount <= args.length) {
            int length = args.length;
            AnyType[] anyTypeArr = this.desiredArgsTypes;
            if (length <= anyTypeArr.length) {
                int length2 = anyTypeArr.length;
                Object[] objArr = new Object[length2];
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    objArr[i11] = null;
                    i11++;
                }
                Iterator itA = p013kotlin.jvm.internal.c.a(args);
                int length3 = args.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    Object next = itA.next();
                    AnyType anyType = this.desiredArgsTypes[i12];
                    try {
                        objArr[i12] = anyType.convert(next, appContext);
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        if (th2 instanceof CodedException) {
                            codedException = (CodedException) th2;
                        } else {
                            if (th2 instanceof expo.modules.core.errors.CodedException) {
                                expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                                String code = codedException2.getCode();
                                s.j(code, "getCode(...)");
                                unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th2);
                            }
                            codedException = unexpectedException;
                        }
                        throw new ArgumentCastException(anyType.getKType(), i12, String.valueOf(next != null ? next.getClass() : null), codedException);
                    }
                }
                return objArr;
            }
        }
        throw new InvalidArgsNumberException(args.length, this.desiredArgsTypes.length, this.requiredArgumentsCount);
    }
}
