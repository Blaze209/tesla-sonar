package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
class v0 extends p6.c implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SearchView f2872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchableInfo f2873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f2874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f2875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f2879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2885y;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f2886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f2887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f2888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f2889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f2890e;

        public a(View view) {
            this.f2886a = (TextView) view.findViewById(R.id.text1);
            this.f2887b = (TextView) view.findViewById(R.id.text2);
            this.f2888c = (ImageView) view.findViewById(R.id.icon1);
            this.f2889d = (ImageView) view.findViewById(R.id.icon2);
            this.f2890e = (ImageView) view.findViewById(i.f.f73817r);
        }
    }

    public v0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2877q = false;
        this.f2878r = 1;
        this.f2880t = -1;
        this.f2881u = -1;
        this.f2882v = -1;
        this.f2883w = -1;
        this.f2884x = -1;
        this.f2885y = -1;
        this.f2872l = searchView;
        this.f2873m = searchableInfo;
        this.f2876p = searchView.getSuggestionCommitIconResId();
        this.f2874n = context;
        this.f2875o = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f2875o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f2879s == null) {
            TypedValue typedValue = new TypedValue();
            this.f2874n.getTheme().resolveAttribute(i.a.P, typedValue, true);
            this.f2879s = this.f2874n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2879s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f2874n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("SuggestionsAdapter", e11.toString());
            return null;
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f2875o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f2875o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = this.f2875o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f2874n.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable drawableM = m(this.f2873m.getSearchActivity());
        return drawableM != null ? drawableM : this.f2874n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f2874n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e12) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e12);
                }
                throw th2;
            }
        } catch (FileNotFoundException e13) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e13.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e13.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || WebrtcBuildVersion.maint_version.equals(str)) {
            return null;
        }
        try {
            int i11 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2874n.getPackageName() + "/" + i11;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawable = androidx.core.content.b.getDrawable(this.f2874n, i11);
            z(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i11 = this.f2883w;
        if (i11 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i11));
        return drawableR != null ? drawableR : o();
    }

    private Drawable t(Cursor cursor) {
        int i11 = this.f2884x;
        if (i11 == -1) {
            return null;
        }
        return r(cursor.getString(i11));
    }

    private static String v(Cursor cursor, int i11) {
        if (i11 == -1) {
            return null;
        }
        try {
            return cursor.getString(i11);
        } catch (Exception e11) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e11);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i11) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i11);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2875o.put(str, drawable.getConstantState());
        }
    }

    @Override // p6.a, p6.b.a
    public void a(Cursor cursor) {
        if (this.f2877q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f2880t = cursor.getColumnIndex("suggest_text_1");
                this.f2881u = cursor.getColumnIndex("suggest_text_2");
                this.f2882v = cursor.getColumnIndex("suggest_text_2_url");
                this.f2883w = cursor.getColumnIndex("suggest_icon_1");
                this.f2884x = cursor.getColumnIndex("suggest_icon_2");
                this.f2885y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e11) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e11);
        }
    }

    @Override // p6.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f2872l.getVisibility() == 0 && this.f2872l.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f2873m, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e11) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e11);
            }
        }
        return null;
    }

    @Override // p6.a, p6.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f2873m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f2873m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // p6.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i11 = this.f2885y;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        if (aVar.f2886a != null) {
            y(aVar.f2886a, v(cursor, this.f2880t));
        }
        if (aVar.f2887b != null) {
            String strV = v(cursor, this.f2882v);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f2881u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f2886a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2886a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2886a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2886a.setMaxLines(1);
                }
            }
            y(aVar.f2887b, charSequenceK);
        }
        ImageView imageView = aVar.f2888c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f2889d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i13 = this.f2878r;
        if (i13 != 2 && (i13 != 1 || (i12 & 1) == 0)) {
            aVar.f2890e.setVisibility(8);
            return;
        }
        aVar.f2890e.setVisibility(0);
        aVar.f2890e.setTag(aVar.f2886a.getText());
        aVar.f2890e.setOnClickListener(this);
    }

    @Override // p6.c, p6.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(i.f.f73817r)).setImageResource(this.f2876p);
        return viewG;
    }

    @Override // p6.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e11);
            View viewF = f(this.f2874n, b(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f2886a.setText(e11.toString());
            }
            return viewF;
        }
    }

    @Override // p6.a, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i11, view, viewGroup);
        } catch (RuntimeException e11) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e11);
            View viewG = g(this.f2874n, b(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f2886a.setText(e11.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2872l.onQueryRefine((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2874n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i11) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i11 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i11));
        }
        return this.f2874n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i11) {
        this.f2878r = i11;
    }
}
