package expo.modules.kotlin.views;

import expo.modules.kotlin.modules.InternalModuleDefinitionBuilder;
import expo.modules.kotlin.modules.Module;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/views/ModuleDefinitionBuilderWithCompose;", "Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;", "module", "Lexpo/modules/kotlin/modules/Module;", "<init>", "(Lexpo/modules/kotlin/modules/Module;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ModuleDefinitionBuilderWithCompose extends InternalModuleDefinitionBuilder {
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilderWithCompose() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ModuleDefinitionBuilderWithCompose(Module module, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : module);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilderWithCompose(Module module) {
        super(module, null, 2, 0 == true ? 1 : 0);
    }
}
