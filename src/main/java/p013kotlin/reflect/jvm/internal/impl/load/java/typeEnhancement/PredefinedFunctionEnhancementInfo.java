package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeEnhancementInfo f87441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<TypeEnhancementInfo> f87442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f87443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PredefinedFunctionEnhancementInfo f87444d;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.f87443c;
    }

    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.f87442b;
    }

    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.f87441a;
    }

    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.f87444d;
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List<TypeEnhancementInfo> parametersInfo, String str) {
        s.k(parametersInfo, "parametersInfo");
        this.f87441a = typeEnhancementInfo;
        this.f87442b = parametersInfo;
        this.f87443c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoCopyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            List<TypeEnhancementInfo> list = parametersInfo;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoCopyForWarnings, arrayList, null);
        }
        this.f87444d = predefinedFunctionEnhancementInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : typeEnhancementInfo, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? null : str);
    }
}
