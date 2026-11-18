# F1 Flight Hunter – Austria 2027

Android project (Kotlin + WebView) with a self-contained offline-capable MVP interface.

## Current functionality
- Fixed trip setup: 2 adults, Buenos Aires, approx. 14 days, July 2027.
- Airport shortlist: VIE, GRZ, BTS, BUD, MUC, KLU, SZG, LNZ.
- Manual fare registration, local history, per-person and two-person totals.
- Price bands: <= USD 1,200 excellent; <= 1,400 good; <= 1,600 acceptable.
- External Google Flights / Skyscanner search links.
- Native Android notification permission and local alerts when a fare is entered.
- Fare records are stored locally in the app WebView storage.

## Important limitations
This MVP does **not** query live airfare inventory, does not automatically refresh prices, and does not calculate verified ground-transfer fares. Those features require a contracted flight-data provider/API and a backend scheduler/notification service. Prices entered in the app are user-entered, not independently verified by the app.

## Build APK
1. Open this folder in Android Studio (recent stable version).
2. Allow Gradle sync and install the Android SDK Platform 35 if prompted.
3. Select Build > Build Bundle(s) / APK(s) > Build APK(s).
4. The debug APK will be under `app/build/outputs/apk/debug/`.

For a production APK, configure a release signing key in Android Studio. Never commit signing keys or API secrets.
