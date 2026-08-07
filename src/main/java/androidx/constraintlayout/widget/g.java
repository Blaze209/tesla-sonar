package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.spi.CallerData;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes.dex */
public class g extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7092c;

    public g(Context context) {
        super(context);
        this.f7090a = -1;
        this.f7091b = null;
        this.f7092c = 4;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f7092c);
        this.f7090a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.R2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.S2) {
                    this.f7090a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7090a);
                } else if (index == i.T2) {
                    this.f7092c = typedArrayObtainStyledAttributes.getInt(index, this.f7092c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f7091b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f7091b.getLayoutParams();
        bVar2.f6927v0.o1(0);
        d5.e.b bVarC = bVar.f6927v0.C();
        d5.e.b bVar3 = d5.e.b.FIXED;
        if (bVarC != bVar3) {
            bVar.f6927v0.p1(bVar2.f6927v0.Y());
        }
        if (bVar.f6927v0.V() != bVar3) {
            bVar.f6927v0.Q0(bVar2.f6927v0.z());
        }
        bVar2.f6927v0.o1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f7090a == -1 && !isInEditMode()) {
            setVisibility(this.f7092c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f7090a);
        this.f7091b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f6903j0 = true;
            this.f7091b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f7091b;
    }

    public int getEmptyVisibility() {
        return this.f7092c;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View viewFindViewById;
        if (this.f7090a == i11) {
            return;
        }
        View view = this.f7091b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f7091b.getLayoutParams()).f6903j0 = false;
            this.f7091b = null;
        }
        this.f7090a = i11;
        if (i11 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i11)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i11) {
        this.f7092c = i11;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7090a = -1;
        this.f7091b = null;
        this.f7092c = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7090a = -1;
        this.f7091b = null;
        this.f7092c = 4;
        a(attributeSet);
    }
}
