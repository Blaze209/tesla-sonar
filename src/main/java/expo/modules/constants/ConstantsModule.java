package expo.modules.constants;

import eb.a;
import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/constants/ConstantsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-constants_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConstantsModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExponentConstants");
            moduleDefinitionBuilder.Constants(new wn0.a<Map<String, ? extends Object>>() { // from class: expo.modules.constants.ConstantsModule$definition$1$1
                @Override // wn0.a
                public final Map<String, ? extends Object> invoke() {
                    Map<String, ? extends Object> constants;
                    ConstantsInterface constants2 = this.this$0.getAppContext().getConstants();
                    return (constants2 == null || (constants = constants2.getConstants()) == null) ? v0.i() : constants;
                }
            });
            moduleDefinitionBuilder.getAsyncFunctions().put("getWebViewUserAgentAsync", new UntypedAsyncFunctionComponent("getWebViewUserAgentAsync", new AnyType[0], new l<Object[], String>() { // from class: expo.modules.constants.ConstantsModule$definition$lambda$1$$inlined$AsyncFunction$1
                @Override // wn0.l
                public final String invoke(Object[] it) {
                    s.k(it, "it");
                    return System.getProperty("http.agent");
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
