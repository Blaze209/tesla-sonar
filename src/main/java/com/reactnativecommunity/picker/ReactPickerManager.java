package com.reactnativecommunity.picker;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ReactPickerManager extends BaseViewManager<h, j> {
    private static final int BLUR_PICKER = 2;
    private static final ReadableArray EMPTY_ARRAY = Arguments.createArray();
    private static final int FOCUS_PICKER = 1;

    private static class a implements h.d, h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f48496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f48497b;

        public a(h hVar, EventDispatcher eventDispatcher) {
            this.f48496a = hVar;
            this.f48497b = eventDispatcher;
        }

        @Override // com.reactnativecommunity.picker.h.d
        public void a(int i11) {
            this.f48497b.h(new c(this.f48496a.getId(), i11));
        }

        @Override // com.reactnativecommunity.picker.h.c
        public void b() {
            this.f48497b.h(new com.reactnativecommunity.picker.a(this.f48496a.getId()));
        }

        @Override // com.reactnativecommunity.picker.h.c
        public void c() {
            this.f48497b.h(new com.reactnativecommunity.picker.b(this.f48496a.getId()));
        }
    }

    private static class b extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LayoutInflater f48498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48499b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f48500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ReadableArray f48501d;

        public b(Context context, ReadableArray readableArray) {
            this.f48501d = readableArray;
            this.f48498a = (LayoutInflater) gn.a.c(context.getSystemService("layout_inflater"));
        }

        private View b(int i11, View view, ViewGroup viewGroup, boolean z11) {
            Integer num;
            ReadableMap item = getItem(i11);
            ReadableMap map = item.hasKey("style") ? item.getMap("style") : null;
            if (view == null) {
                view = this.f48498a.inflate(z11 ? f.f48506a : f.f48507b, viewGroup, false);
            }
            boolean z12 = item.hasKey("enabled") ? item.getBoolean("enabled") : true;
            view.setEnabled(z12);
            view.setClickable(!z12);
            TextView textView = (TextView) view;
            textView.setText(item.getString(AnnotatedPrivateKey.LABEL));
            textView.setMaxLines(this.f48499b);
            if (map != null) {
                if (!map.hasKey("backgroundColor") || map.isNull("backgroundColor")) {
                    view.setBackgroundColor(0);
                } else {
                    view.setBackgroundColor(map.getInt("backgroundColor"));
                }
                if (map.hasKey("color") && !map.isNull("color")) {
                    textView.setTextColor(map.getInt("color"));
                }
                if (map.hasKey(OrcaFlavourKeys.FONT_SIZE) && !map.isNull(OrcaFlavourKeys.FONT_SIZE)) {
                    textView.setTextSize((float) map.getDouble(OrcaFlavourKeys.FONT_SIZE));
                }
                if (map.hasKey("fontFamily") && !map.isNull("fontFamily")) {
                    textView.setTypeface(Typeface.create(map.getString("fontFamily"), 0));
                }
            }
            if (!z11 && (num = this.f48500c) != null) {
                textView.setTextColor(num.intValue());
            } else if (item.hasKey("color") && !item.isNull("color")) {
                textView.setTextColor(item.getInt("color"));
            }
            if (item.hasKey("fontFamily") && !item.isNull("fontFamily")) {
                textView.setTypeface(Typeface.create(item.getString("fontFamily"), 0));
            }
            if (com.facebook.react.modules.i18nmanager.a.f().i(view.getContext())) {
                view.setLayoutDirection(1);
                view.setTextDirection(4);
                return view;
            }
            view.setLayoutDirection(0);
            view.setTextDirection(3);
            return view;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReadableMap getItem(int i11) {
            ReadableArray readableArray = this.f48501d;
            if (readableArray == null) {
                return null;
            }
            return readableArray.getMap(i11);
        }

        public void c(ReadableArray readableArray) {
            this.f48501d = readableArray;
            notifyDataSetChanged();
        }

        public void d(int i11) {
            this.f48499b = i11;
            notifyDataSetChanged();
        }

        public void e(Integer num) {
            this.f48500c = num;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ReadableArray readableArray = this.f48501d;
            if (readableArray == null) {
                return 0;
            }
            return readableArray.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            return b(i11, view, viewGroup, true);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            return b(i11, view, viewGroup, false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return jn.c.e("focus", 1, "blur", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("topSelect", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b("topFocus", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onBlur", "captured", "onBlurCapture"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends j> getShadowNodeClass() {
        return j.class;
    }

    @no.a(customType = "Color", name = "color")
    public void setColor(h hVar, Integer num) {
        hVar.setPrimaryColor(num);
        b bVar = (b) hVar.getAdapter();
        if (bVar != null) {
            bVar.e(num);
        }
    }

    @no.a(name = "dropdownIconColor")
    public void setDropdownIconColor(h hVar, int i11) {
        hVar.setDropdownIconColor(i11);
    }

    @no.a(name = "dropdownIconRippleColor")
    public void setDropdownIconRippleColor(h hVar, int i11) {
        hVar.setDropdownIconRippleColor(i11);
    }

    @no.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(h hVar, boolean z11) {
        hVar.setEnabled(z11);
    }

    @no.a(name = "items")
    public void setItems(h hVar, ReadableArray readableArray) {
        b bVar = (b) hVar.getAdapter();
        if (bVar != null) {
            bVar.c(readableArray);
            return;
        }
        b bVar2 = new b(hVar.getContext(), readableArray);
        bVar2.e(hVar.getPrimaryColor());
        hVar.setAdapter((SpinnerAdapter) bVar2);
    }

    @no.a(defaultInt = 1, name = "numberOfLines")
    public void setNumberOfLines(h hVar, int i11) {
        b bVar = (b) hVar.getAdapter();
        if (bVar != null) {
            bVar.d(i11);
            return;
        }
        b bVar2 = new b(hVar.getContext(), EMPTY_ARRAY);
        bVar2.e(hVar.getPrimaryColor());
        bVar2.d(i11);
        hVar.setAdapter((SpinnerAdapter) bVar2);
    }

    @no.a(name = "prompt")
    public void setPrompt(h hVar, String str) {
        hVar.setPrompt(str);
    }

    @no.a(name = "selected")
    public void setSelected(h hVar, int i11) {
        hVar.setStagedSelection(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(h hVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(v0 v0Var, h hVar) {
        a aVar = new a(hVar, ((UIManagerModule) v0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher());
        hVar.setOnSelectListener(aVar);
        hVar.setOnFocusListener(aVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction(hVar);
        hVar.f();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = "backgroundColor")
    public void setBackgroundColor(h hVar, int i11) {
        hVar.setBackgroundColor(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull h hVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            hVar.performClick();
        } else {
            if (i11 != 2) {
                return;
            }
            hVar.clearFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull h hVar, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("blur")) {
            hVar.clearFocus();
        } else if (str.equals("focus")) {
            hVar.performClick();
        }
    }
}
