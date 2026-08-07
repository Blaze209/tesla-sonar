package com.google.android.libraries.places.widget.internal.ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.core.content.b;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzbx;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzgt;
import com.google.android.libraries.places.internal.zzgu;
import com.google.android.libraries.places.internal.zzgv;
import com.google.android.libraries.places.internal.zzhf;
import com.google.android.libraries.places.internal.zzhj;
import com.google.android.libraries.places.internal.zzhl;
import com.google.android.libraries.places.internal.zzho;
import com.google.android.libraries.places.internal.zzhp;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ValidFragment"})
public final class AutocompleteImplFragment extends Fragment {
    private final PlacesClient zza;
    private final zzgr zzb;
    private final zzhp zzc;
    private final zzbx zzd;
    private zzhl zze;
    private PlaceSelectionListener zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzr zzs;
    private final zzj zzt;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzho zzhoVar = new zzho(this.zzb.zzf(), this.zzb.zzh(), this.zzb.zzm(), this.zzd);
            zzhl zzhlVar = (zzhl) new ViewModelProvider(this, new zzhj(new zzhf(this.zza, this.zzb, zzhoVar.zzh()), zzhoVar, this.zzc)).b(zzhl.class);
            this.zze = zzhlVar;
            zzhlVar.zze(bundle);
            requireActivity().getOnBackPressedDispatcher().i(this, new zzf(this, true));
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zze.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zze.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle bundle) throws Throwable {
        int identifier;
        try {
            this.zzg = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzi = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzj = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(R.id.places_autocomplete_progress);
            this.zzm = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzl(null));
            this.zzg.setHint(TextUtils.isEmpty(this.zzb.zzl()) ? zzgu.zzc(requireContext(), R.string.places_autocomplete_search_hint) : this.zzb.zzl());
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = this.zzb.zzh().ordinal();
            if (iOrdinal == 0) {
                int iZza = this.zzb.zza();
                int iZzb = this.zzb.zzb();
                if (Color.alpha(iZza) < 255) {
                    iZza = 0;
                }
                if (iZza != 0 && iZzb != 0) {
                    int iZza2 = zzgv.zza(iZza, b.getColor(requireContext(), R.color.places_text_white_alpha_87), b.getColor(requireContext(), R.color.places_text_black_alpha_87));
                    int iZza3 = zzgv.zza(iZza, b.getColor(requireContext(), R.color.places_text_white_alpha_26), b.getColor(requireContext(), R.color.places_text_black_alpha_26));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(iZza);
                    Window window = requireActivity().getWindow();
                    if (zzgv.zzc(iZzb, -1, -16777216)) {
                        window.setStatusBarColor(iZzb);
                        window.getDecorView().setSystemUiVisibility(PKIFailureInfo.certRevoked);
                    } else {
                        window.setStatusBarColor(iZzb);
                    }
                    this.zzg.setTextColor(iZza2);
                    this.zzg.setHintTextColor(iZza3);
                    zzgv.zzb((ImageView) this.zzi, iZza2);
                    zzgv.zzb((ImageView) this.zzj, iZza2);
                }
            } else if (iOrdinal == 1 && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                requireActivity().getWindow().addFlags(67108864);
                ViewCompat.F0(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
            }
            this.zzi.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzc(view2);
                }
            });
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzd(view2);
                }
            });
            this.zzr.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.zza.zzf(view2);
                }
            });
            this.zzs = new zzr(new zzb(this), null);
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzo(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.n(new zzg(this));
            this.zze.zza().observe(getViewLifecycleOwner(), new j0() { // from class: com.google.android.libraries.places.widget.internal.ui.zze
                @Override // androidx.p003lifecycle.j0
                public final void onChanged(Object obj) throws Throwable {
                    this.zza.zzg((zzgt) obj);
                }
            });
        } catch (Error e11) {
            e = e11;
            zzgb.zzb(e);
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            zzgb.zzb(e);
            throw e;
        }
    }

    final /* synthetic */ void zzc(View view) {
        this.zze.zzj();
    }

    final /* synthetic */ void zzd(View view) {
        try {
            this.zze.zzk();
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i11) {
        try {
            this.zze.zzf(autocompletePrediction, i11);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    final /* synthetic */ void zzf(View view) {
        try {
            this.zze.zzl(this.zzg.getText().toString());
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    final /* synthetic */ void zzg(zzgt zzgtVar) throws Throwable {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzgtVar.zzf() - 1) {
                case 0:
                    if (TextUtils.isEmpty(this.zzb.zzm())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzm());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzs.submitList(null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 2:
                    this.zzl.setVisibility(0);
                    return;
                case 3:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 4:
                    this.zzs.submitList(zzgtVar.zzd());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(R.string.places_autocomplete_no_results_for_query, zzgtVar.zze()));
                    this.zzq.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    PlaceSelectionListener placeSelectionListener = this.zzf;
                    Place placeZzc = zzgtVar.zzc();
                    if (placeZzc == null) {
                        throw null;
                    }
                    placeSelectionListener.onPlaceSelected(placeZzc);
                    return;
                case 8:
                    AutocompletePrediction autocompletePredictionZzb = zzgtVar.zzb();
                    zzig.zzc(autocompletePredictionZzb, "Prediction should not be null.");
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(autocompletePredictionZzb.getPrimaryText(null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzf;
                    Status statusZza = zzgtVar.zza();
                    if (statusZza == null) {
                        throw null;
                    }
                    placeSelectionListener2.onError(statusZza);
                    return;
            }
            this.zzs.submitList(null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(R.string.places_search_error));
            this.zzq.setVisibility(0);
        } catch (Error e11) {
            e = e11;
            zzgb.zzb(e);
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            zzgb.zzb(e);
            throw e;
        }
    }

    public final void zzh(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }

    private AutocompleteImplFragment(int i11, PlacesClient placesClient, zzgr zzgrVar, zzhp zzhpVar, zzbx zzbxVar) {
        super(i11);
        this.zzt = new zzj(this, null);
        this.zza = placesClient;
        this.zzb = zzgrVar;
        this.zzc = zzhpVar;
        this.zzd = zzbxVar;
    }
}
