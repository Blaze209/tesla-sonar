package expo.modules.kotlin.objects;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import java.util.Iterator;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Ljn0/h0;", "block", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Object", "(Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;Lwn0/l;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/modules/Module;", "(Lexpo/modules/kotlin/modules/Module;Lwn0/l;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ObjectDefinitionBuilderKt {
    public static final JavaScriptModuleObject_ Object(ModuleDefinitionBuilder moduleDefinitionBuilder, l<? super ObjectDefinitionBuilder, h0> block) {
        s.k(moduleDefinitionBuilder, "<this>");
        s.k(block, "block");
        Module module = moduleDefinitionBuilder.getModule();
        s.h(module);
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        block.invoke(objectDefinitionBuilder);
        ObjectDefinitionData objectDefinitionDataBuildObject = objectDefinitionBuilder.buildObject();
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(objectDefinitionDataBuildObject.getLegacyConstantsProvider().invoke());
        JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(module.getRuntimeContext().getJniDeallocator());
        s.h(writableNativeMapMakeNativeMap);
        jSDecoratorsBridgingObject.registerConstants(writableNativeMapMakeNativeMap);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataBuildObject.getFunctions();
        while (functions.hasNext()) {
            functions.next().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject, "[Anonymous Object]");
        }
        Iterator<Map.Entry<String, PropertyComponent>> it = objectDefinitionDataBuildObject.getProperties().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject);
        }
        Iterator<Map.Entry<String, ConstantComponent>> it2 = objectDefinitionDataBuildObject.getConstants().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().attachToJSObject(jSDecoratorsBridgingObject);
        }
        JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(module.getRuntimeContext().getJniDeallocator(), "[Anonymous Object]");
        javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
        return javaScriptModuleObject_;
    }

    public static final JavaScriptModuleObject_ Object(Module module, l<? super ObjectDefinitionBuilder, h0> block) {
        s.k(module, "<this>");
        s.k(block, "block");
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        block.invoke(objectDefinitionBuilder);
        ObjectDefinitionData objectDefinitionDataBuildObject = objectDefinitionBuilder.buildObject();
        WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(objectDefinitionDataBuildObject.getLegacyConstantsProvider().invoke());
        JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(module.getRuntimeContext().getJniDeallocator());
        s.h(writableNativeMapMakeNativeMap);
        jSDecoratorsBridgingObject.registerConstants(writableNativeMapMakeNativeMap);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataBuildObject.getFunctions();
        while (functions.hasNext()) {
            functions.next().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject, "[Anonymous Object]");
        }
        Iterator<Map.Entry<String, PropertyComponent>> it = objectDefinitionDataBuildObject.getProperties().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().attachToJSObject(module.getAppContext(), jSDecoratorsBridgingObject);
        }
        Iterator<Map.Entry<String, ConstantComponent>> it2 = objectDefinitionDataBuildObject.getConstants().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().attachToJSObject(jSDecoratorsBridgingObject);
        }
        JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(module.getRuntimeContext().getJniDeallocator(), "[Anonymous Object]");
        javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
        return javaScriptModuleObject_;
    }
}
