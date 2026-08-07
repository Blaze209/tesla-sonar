package expo.modules.kotlin.defaultmodules;

import android.os.Bundle;
import eb.a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", "Ljn0/h0;", "reportExceptionToLogBox", "(Lexpo/modules/kotlin/exception/CodedException;)V", "", "warning", "reportWarningToLogBox", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorManagerModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoModulesCoreErrorManager");
            moduleDefinitionBuilder.Events("ExpoModulesCoreErrorManager.onNewException", "ExpoModulesCoreErrorManager.onNewWarning");
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }

    public final void reportExceptionToLogBox(CodedException codedException) {
        s.k(codedException, "codedException");
        Bundle bundle = new Bundle();
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        bundle.putString("message", message);
        h0 h0Var = h0.f84049a;
        sendEvent("ExpoModulesCoreErrorManager.onNewException", bundle);
    }

    public final void reportWarningToLogBox(String warning) {
        s.k(warning, "warning");
        Bundle bundle = new Bundle();
        bundle.putString("message", warning);
        h0 h0Var = h0.f84049a;
        sendEvent("ExpoModulesCoreErrorManager.onNewWarning", bundle);
    }
}
