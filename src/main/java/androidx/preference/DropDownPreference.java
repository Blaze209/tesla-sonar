package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import ma.c;

/* JADX INFO: loaded from: classes3.dex */
public class DropDownPreference extends ListPreference {
    private final Context O;
    private final ArrayAdapter P;
    private Spinner Q;
    private final AdapterView.OnItemSelectedListener R;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (i11 >= 0) {
                String string = DropDownPreference.this.I()[i11].toString();
                if (string.equals(DropDownPreference.this.J()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.L(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f91631c);
    }

    private void N() {
        this.P.clear();
        if (G() != null) {
            for (CharSequence charSequence : G()) {
                this.P.add(charSequence.toString());
            }
        }
    }

    @NonNull
    protected ArrayAdapter M() {
        return new ArrayAdapter(this.O, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    protected void r() {
        super.r();
        ArrayAdapter arrayAdapter = this.P;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void t() {
        this.Q.performClick();
    }

    public DropDownPreference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public DropDownPreference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.R = new a();
        this.O = context;
        this.P = M();
        N();
    }
}
