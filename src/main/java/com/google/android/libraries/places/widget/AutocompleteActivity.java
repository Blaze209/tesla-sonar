package com.google.android.libraries.places.widget;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.c;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* JADX INFO: loaded from: classes5.dex */
public class AutocompleteActivity extends c implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    static boolean zza = true;
    private int zzb;
    private int zzc;
    private boolean zzd;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
        this.zzd = false;
    }

    private final void zzc(int i11, Place place, Status status) throws Throwable {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i11, intent);
            finish();
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

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) throws Throwable {
        try {
            zzig.zzi(Places.isInitialized(), "Places must be initialized.");
            if (zza) {
                zzig.zzi(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            }
            zzgr zzgrVar = (zzgr) getIntent().getParcelableExtra("places/AutocompleteOptions");
            if (zzgrVar == null) {
                throw null;
            }
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int iOrdinal = zzgrVar.zzh().ordinal();
            if (iOrdinal == 0) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzc = R.style.PlacesAutocompleteFullscreen;
            } else if (iOrdinal == 1) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzc = R.style.PlacesAutocompleteOverlay;
            }
            getSupportFragmentManager().v1(new com.google.android.libraries.places.widget.internal.ui.zzh(this.zzb, this, zzgrVar));
            setTheme(this.zzc);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().n0(R.id.places_autocomplete_content);
            zzig.zzh(autocompleteImplFragment != null);
            autocompleteImplFragment.zzh(this);
            final View viewFindViewById = findViewById(android.R.id.content);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.zza.zzb(autocompleteImplFragment, viewFindViewById, view, motionEvent);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.zza.zza(view);
                }
            });
            if (zzgrVar.zzj().isEmpty()) {
                zzc(2, null, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
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

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) throws Throwable {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) throws Throwable {
        zzc(-1, place, Status.RESULT_SUCCESS);
    }

    final /* synthetic */ void zza(View view) throws Throwable {
        if (this.zzd) {
            zzc(0, null, new Status(16));
        }
    }

    final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzd = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 == null || motionEvent.getY() <= view3.getBottom()) {
            return false;
        }
        this.zzd = true;
        view.performClick();
        return true;
    }
}
