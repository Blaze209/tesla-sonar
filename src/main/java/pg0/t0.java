package pg0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J*\u0010*\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b)0(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00109R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R0\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170=j\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010CR*\u0010G\u001a\u00020B2\u0006\u0010E\u001a\u00020B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010C\u001a\u0004\bG\u0010H\"\u0004\bF\u0010I¨\u0006J"}, d2 = {"Lpg0/t0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lpg0/b0;", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "Lkotlin/Function1;", "Lpg0/d4;", "Ljn0/h0;", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lwn0/l;)V", "Ltg0/e;", "viewHolder", "b", "(Ltg0/e;)V", "binding", "Landroid/graphics/drawable/Drawable;", "drawableRes", "h", "(Ltg0/e;Landroid/graphics/drawable/Drawable;)V", "", "strokeColor", "fillColor", "iconDrawable", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "pressedColor", "Landroid/content/res/ColorStateList;", "c", "(I)Landroid/content/res/ColorStateList;", "Landroid/view/ViewGroup;", "parent", "viewType", "Lyh0/b0;", "Lkotlin/jvm/internal/EnhancedNullability;", "f", "(Landroid/view/ViewGroup;I)Lyh0/b0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Lwn0/l;", "getOnClick", "()Lwn0/l;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "cachedImages", "", "Z", "useIcons", "value", "g", "isEnabled", "()Z", "(Z)V", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<EnabledIdClass> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StepStyles.GovernmentIdStepStyle styles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<IdConfig, jn0.h0> onClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, Drawable> cachedImages;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useIcons;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102884a;

        static {
            int[] iArr = new int[h4.values().length];
            try {
                iArr[h4.World.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h4.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h4.Flag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h4.House.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102884a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(Context context, List<EnabledIdClass> data, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, wn0.l<? super IdConfig, jn0.h0> onClick) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(data, "data");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        this.data = data;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.onClick = onClick;
        this.cachedImages = new HashMap<>();
        this.useIcons = !yh0.s.b(context, qh0.a.f105519d, null, false, false, 14, null);
        this.isEnabled = true;
    }

    private final void b(tg0.e viewHolder) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
            TextView label = viewHolder.f113467e;
            p013kotlin.jvm.internal.s.j(label, "label");
            ui0.e0.n(label, governmentIdVerticalOptionTextStyle, null, 2, null);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (chevronColor = governmentIdStepStyle2.getChevronColor()) != null) {
            viewHolder.f113464b.setColorFilter(chevronColor.intValue());
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this.styles;
        if (governmentIdStepStyle3 != null && (backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            Integer activeOptionBackgroundColorValue = this.styles.getActiveOptionBackgroundColorValue();
            if (activeOptionBackgroundColorValue != null) {
                viewHolder.getRoot().setBackground(new RippleDrawable(c(activeOptionBackgroundColorValue.intValue()), new ColorDrawable(iIntValue), null));
            }
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = this.styles;
        if (governmentIdStepStyle4 == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle4.getGovernmentIdSelectOptionMinRowHeight()) == null) {
            return;
        }
        viewHolder.f113468f.setMinHeight((int) yh0.h.a(governmentIdSelectOptionMinRowHeight.doubleValue()));
    }

    private final ColorStateList c(int pressedColor) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{pressedColor});
    }

    private final Drawable d(Context context, Integer strokeColor, Integer fillColor, Drawable iconDrawable) {
        Drawable drawableMutate;
        ArrayList arrayList = new ArrayList();
        if (strokeColor != null) {
            iconDrawable.mutate().setTint(strokeColor.intValue());
        }
        Drawable drawableB = j.a.b(context, m4.f102585e);
        if (fillColor != null && drawableB != null && (drawableMutate = drawableB.mutate()) != null) {
            drawableMutate.setTint(fillColor.intValue());
        }
        if (drawableB != null) {
            arrayList.add(drawableB);
        }
        arrayList.add(iconDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(t0 t0Var, EnabledIdClass enabledIdClass, View view) {
        t0Var.onClick.invoke(enabledIdClass.getIdConfig());
    }

    private final void h(tg0.e binding, Drawable drawableRes) {
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        Integer numValueOf = null;
        Integer numValueOf2 = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (governmentIdIconFillColor = governmentIdStepStyle2.getGovernmentIdIconFillColor()) != null) {
            numValueOf = Integer.valueOf(governmentIdIconFillColor.intValue());
        }
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Drawable drawableMutate = d(context, numValueOf2, numValueOf, drawableRes).mutate();
        p013kotlin.jvm.internal.s.j(drawableMutate, "mutate(...)");
        binding.f113465c.setImageDrawable(drawableMutate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public yh0.b0<tg0.e> onCreateViewHolder(ViewGroup parent, int viewType) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        tg0.e eVarC = tg0.e.c(LayoutInflater.from(parent.getContext()), parent, false);
        p013kotlin.jvm.internal.s.j(eVarC, "inflate(...)");
        yh0.b0<tg0.e> b0Var = new yh0.b0<>(eVarC);
        gb.a aVarA = b0Var.a();
        p013kotlin.jvm.internal.s.j(aVarA, "<get-binding>(...)");
        b((tg0.e) aVarA);
        return b0Var;
    }

    public final void g(boolean z11) {
        if (this.isEnabled == z11) {
            return;
        }
        this.isEnabled = z11;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.data.size();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 holder, int position) {
        RemoteImage iconPassport;
        int i11;
        p013kotlin.jvm.internal.s.k(holder, "holder");
        final EnabledIdClass enabledIdClass = this.data.get(position);
        tg0.e eVar = (tg0.e) yh0.c0.a(holder);
        eVar.f113467e.setText(enabledIdClass.getName());
        h4 icon = enabledIdClass.getIcon();
        int[] iArr = a.f102884a;
        int i12 = iArr[icon.ordinal()];
        if (i12 == 1) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.assetConfig;
            if (selectPage != null) {
                iconPassport = selectPage.getIconPassport();
            } else {
                iconPassport = null;
            }
        } else if (i12 == 2) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage2 = this.assetConfig;
            if (selectPage2 != null) {
                iconPassport = selectPage2.getIconGovernmentId();
            } else {
                iconPassport = null;
            }
        } else if (i12 == 3) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage3 = this.assetConfig;
            if (selectPage3 != null) {
                iconPassport = selectPage3.getIconDriversLicense();
            } else {
                iconPassport = null;
            }
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage4 = this.assetConfig;
            if (selectPage4 == null || (iconPassport = selectPage4.getIconNationalId()) == null) {
                NextStep.GovernmentId.AssetConfig.SelectPage selectPage5 = this.assetConfig;
                if (selectPage5 != null) {
                    iconPassport = selectPage5.getIconGovernmentId();
                } else {
                    iconPassport = null;
                }
            }
        }
        Object tag = eVar.f113466d.getTag(n4.f102727h0);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            eVar.f113466d.removeView(view);
        }
        if (!this.useIcons) {
            eVar.f113466d.setVisibility(8);
            TextView label = eVar.f113467e;
            p013kotlin.jvm.internal.s.j(label, "label");
            label.setPaddingRelative(0, label.getPaddingTop(), label.getPaddingEnd(), label.getPaddingBottom());
        } else if (iconPassport != null) {
            ConstraintLayout iconContainer = eVar.f113466d;
            p013kotlin.jvm.internal.s.j(iconContainer, "iconContainer");
            eVar.f113466d.setTag(n4.f102727h0, wi0.b.b(iconPassport, iconContainer, true));
            eVar.f113465c.setVisibility(8);
            TextView label2 = eVar.f113467e;
            p013kotlin.jvm.internal.s.j(label2, "label");
            label2.setPaddingRelative((int) yh0.h.a(8.0d), label2.getPaddingTop(), label2.getPaddingEnd(), label2.getPaddingBottom());
        } else {
            eVar.f113465c.setVisibility(0);
            if (this.cachedImages.get(Integer.valueOf(position)) != null) {
                eVar.f113465c.setImageDrawable(this.cachedImages.get(Integer.valueOf(position)));
            } else {
                int i13 = iArr[enabledIdClass.getIcon().ordinal()];
                if (i13 == 1) {
                    i11 = m4.f102591k;
                } else if (i13 == 2) {
                    i11 = m4.f102584d;
                } else if (i13 == 3) {
                    i11 = m4.f102588h;
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11 = m4.f102589i;
                }
                Drawable drawableB = j.a.b(eVar.getRoot().getContext(), i11);
                if (drawableB != null) {
                    h(eVar, drawableB);
                    this.cachedImages.put(Integer.valueOf(position), eVar.f113465c.getDrawable());
                }
            }
            TextView label3 = eVar.f113467e;
            p013kotlin.jvm.internal.s.j(label3, "label");
            label3.setPaddingRelative((int) yh0.h.a(8.0d), label3.getPaddingTop(), label3.getPaddingEnd(), label3.getPaddingBottom());
        }
        eVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: pg0.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                t0.e(this.f102865a, enabledIdClass, view2);
            }
        });
        eVar.getRoot().setEnabled(this.isEnabled);
    }
}
