package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ma.c;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends Preference {
    int D;
    int E;
    private int F;
    private int G;
    boolean H;
    SeekBar I;
    private TextView J;
    boolean K;
    private boolean L;
    boolean M;
    private final SeekBar.OnSeekBarChangeListener N;
    private final View.OnKeyListener O;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            if (z11) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.M || !seekBarPreference.H) {
                    seekBarPreference.I(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.J(i11 + seekBarPreference2.E);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.H = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.H = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.E != seekBarPreference.D) {
                seekBarPreference.I(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.K && (i11 == 21 || i11 == 22)) || i11 == 23 || i11 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.I;
            if (seekBar != null) {
                return seekBar.onKeyDown(i11, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.N = new a();
        this.O = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C0, i11, i12);
        this.E = typedArrayObtainStyledAttributes.getInt(g.F0, 0);
        F(typedArrayObtainStyledAttributes.getInt(g.D0, 100));
        G(typedArrayObtainStyledAttributes.getInt(g.G0, 0));
        this.K = typedArrayObtainStyledAttributes.getBoolean(g.E0, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(g.H0, false);
        this.M = typedArrayObtainStyledAttributes.getBoolean(g.I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H(int i11, boolean z11) {
        int i12 = this.E;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.F;
        if (i11 > i13) {
            i11 = i13;
        }
        if (i11 != this.D) {
            this.D = i11;
            J(i11);
            A(i11);
            if (z11) {
                r();
            }
        }
    }

    public final void F(int i11) {
        int i12 = this.E;
        if (i11 < i12) {
            i11 = i12;
        }
        if (i11 != this.F) {
            this.F = i11;
            r();
        }
    }

    public final void G(int i11) {
        if (i11 != this.G) {
            this.G = Math.min(this.F - this.E, Math.abs(i11));
            r();
        }
    }

    void I(@NonNull SeekBar seekBar) {
        int progress = this.E + seekBar.getProgress();
        if (progress != this.D) {
            if (a(Integer.valueOf(progress))) {
                H(progress, false);
            } else {
                seekBar.setProgress(this.D - this.E);
                J(this.D);
            }
        }
    }

    void J(int i11) {
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    @Override // androidx.preference.Preference
    protected Object v(@NonNull TypedArray typedArray, int i11) {
        return Integer.valueOf(typedArray.getInt(i11, 0));
    }

    public SeekBarPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SeekBarPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f91636h);
    }
}
