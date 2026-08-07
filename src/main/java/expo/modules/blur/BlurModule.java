package expo.modules.blur;

import android.view.View;
import co0.d;
import co0.q;
import eb.a;
import expo.modules.blur.enums.BlurMethod;
import expo.modules.blur.enums.TintStyle;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/blur/BlurModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-blur_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlurModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() throws Throwable {
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            try {
                ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
                moduleDefinitionBuilder.Name("ExpoBlurView");
                ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(o0.b(ExpoBlurView.class), new LazyKType(o0.b(ExpoBlurView.class), false, new wn0.a<q>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$$inlined$View$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ExpoBlurView.class);
                    }
                }, 2, null), moduleDefinitionBuilder.getConverters());
                CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
                BlurModule$definition$1$1$1 blurModule$definition$1$1$1 = new p<ExpoBlurView, Float, h0>() { // from class: expo.modules.blur.BlurModule$definition$1$1$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(ExpoBlurView expoBlurView, Float f11) {
                        invoke(expoBlurView, f11.floatValue());
                        return h0.f84049a;
                    }

                    public final void invoke(ExpoBlurView view, float f11) {
                        s.k(view, "view");
                        view.setBlurRadius(f11);
                    }
                };
                Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                d dVarB = o0.b(Float.class);
                Boolean bool = Boolean.FALSE;
                AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(Float.class), false, new wn0.a<q>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$lambda$1$$inlined$Prop$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Float.TYPE);
                        }
                    }), null);
                }
                props.put("intensity", new ConcreteViewProp("intensity", anyType, blurModule$definition$1$1$1));
                BlurModule$definition$1$1$2 blurModule$definition$1$1$2 = new p<ExpoBlurView, TintStyle, h0>() { // from class: expo.modules.blur.BlurModule$definition$1$1$2
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(ExpoBlurView expoBlurView, TintStyle tintStyle) {
                        invoke2(expoBlurView, tintStyle);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ExpoBlurView view, TintStyle tint) {
                        s.k(view, "view");
                        s.k(tint, "tint");
                        view.setTint$expo_blur_release(tint);
                    }
                };
                Map<String, AnyViewProp> props2 = viewDefinitionBuilder.getProps();
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(TintStyle.class), bool));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(TintStyle.class), false, new wn0.a<q>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$lambda$1$$inlined$Prop$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(TintStyle.class);
                        }
                    }), null);
                }
                props2.put("tint", new ConcreteViewProp("tint", anyType2, blurModule$definition$1$1$2));
                BlurModule$definition$1$1$3 blurModule$definition$1$1$3 = new p<ExpoBlurView, Float, h0>() { // from class: expo.modules.blur.BlurModule$definition$1$1$3
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(ExpoBlurView expoBlurView, Float f11) {
                        invoke(expoBlurView, f11.floatValue());
                        return h0.f84049a;
                    }

                    public final void invoke(ExpoBlurView view, float f11) {
                        s.k(view, "view");
                        view.applyBlurReduction(f11);
                    }
                };
                Map<String, AnyViewProp> props3 = viewDefinitionBuilder.getProps();
                AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Float.class), bool));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(Float.class), false, new wn0.a<q>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$lambda$1$$inlined$Prop$3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Float.TYPE);
                        }
                    }), null);
                }
                props3.put("blurReductionFactor", new ConcreteViewProp("blurReductionFactor", anyType3, blurModule$definition$1$1$3));
                BlurModule$definition$1$1$4 blurModule$definition$1$1$4 = new p<ExpoBlurView, BlurMethod, h0>() { // from class: expo.modules.blur.BlurModule$definition$1$1$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(ExpoBlurView expoBlurView, BlurMethod blurMethod) {
                        invoke2(expoBlurView, blurMethod);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ExpoBlurView view, BlurMethod experimentalBlurMethod) {
                        s.k(view, "view");
                        s.k(experimentalBlurMethod, "experimentalBlurMethod");
                        view.setBlurMethod(experimentalBlurMethod);
                    }
                };
                Map<String, AnyViewProp> props4 = viewDefinitionBuilder.getProps();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r0), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(o0.b(BlurMethod.class), false, new wn0.a<q>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$lambda$1$$inlined$Prop$4
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(BlurMethod.class);
                        }
                    }), null);
                }
                props4.put("experimentalBlurMethod", new ConcreteViewProp("experimentalBlurMethod", anyType4, blurModule$definition$1$1$4));
                viewDefinitionBuilder.setOnViewDidUpdateProps(new l<View, h0>() { // from class: expo.modules.blur.BlurModule$definition$lambda$2$lambda$1$$inlined$OnViewDidUpdateProps$1
                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(View view) {
                        invoke2(view);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        s.k(it, "it");
                        ((ExpoBlurView) it).applyTint();
                    }
                });
                moduleDefinitionBuilder.registerViewDefinition(viewDefinitionBuilder.build());
                ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
                a.f();
                return moduleDefinitionDataBuildModule;
            } catch (Throwable th2) {
                th = th2;
                a.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
