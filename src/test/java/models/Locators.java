package models;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Locators {


    public SelenideElement closeBonusPopupButton = $x("//button[contains(@class, 'GiftPopup_close')]");
    public SelenideElement registerButton = $x("//div[@class='Header_registration__1-FfP']/button");
    public SelenideElement registerButtonFake = $x("//div[@class='Header_reistration__1-FfP']/button");
    public SelenideElement loginButton = $x("//button[contains(@class, 'auto_login Button')]");
    public SelenideElement regByEmailButton = $x("//button[contains(@class, 'auto_email_reg')]");
    public SelenideElement emailInputAreaLoc = $x("//input[contains(@class, 'auto_email_reg_mail')]");
    public SelenideElement passwordInputAreaLoc = $x("//input[contains(@class, 'auto_email_reg_password')]");
    public SelenideElement signUpButton = $x("//button[contains(@class, 'auto_reg_submit_button')]");
    public SelenideElement refillButton = $x("//div[contains(@class, 'ActiveBonusUserBalance_dropdown')]");
    public SelenideElement personalAccountButtonLoc = $x("//div[contains(@class, 'ProfilePanel_pane')]");
    public SelenideElement accountAndId = $x("//h3[@class='TopBar_subtitle__2xqY7 auto_text']"); // mostbet.com
    public SelenideElement accountAndId_BA = $x("//div[contains(@class, 'TopBar_subtitle')]"); // BA
    public SelenideElement logoutButtonLoc = $x("//button[contains(@class, 'auto_profile_menu_logout')]");
    public SelenideElement logoutModalYesButton = $x("//button[contains(@class, 'Button_button_skin-accept')]");

    //восстановление пароля
    public By forgotPasswordButtonLoc = By.xpath("//button[@class='LoginForm_forgotPassBtn__3oQ0d LoginForm_forgotPassBtn__14nDr auto_sign_in_forgot_password LinkStyledButton_button__2T387 LinkStyledButton_button_skin-colored__2O7_Q']");
    public By inputUsernameForRecoveryPasswordLoc = By.xpath("//input[@id='username']");
    public By submitButtonResetPasswordLoc = By.xpath("//div[@class='RequestCode_root__2JynA']/button");
    public By typeCodeLoc = By.xpath("//label[@for='username']");
    public By typePasswordLoc = By.xpath("//input[@id='typedPassword']");
    public By confirmPasswordLoc = By.xpath("//input[@id='confirm']");
    public By buttonSavePasswordLoc = By.xpath("//button[@class='auto_button SetPassword_submitBtn__1xlEb ResetPassword_submitBtn__1GdqY auto_recover_save Button_button__32FwK Button_button_size-l__2JPWQ Button_button_skin-accept__1hyO6']");

    public By usernameForAuthLoc = By.xpath("//input[@id='uReal']");
    public By passwordForAuthLoc = By.xpath("//input[@id='pReal']");
    public By submitButtonLoginLoc = By.xpath("//div[@class='LoginForm_submitBlock__1apCZ LoginForm_submitBlock__32xsp']/button[1]");

    //кнопки хедера
    public SelenideElement actionsButton = $(".MainButton_switchButton__2HULL");
    public SelenideElement downloadAndroidButton = $x("//a[@href ='/app?platform=android']");
    public SelenideElement downloadIosButton = $x("//a[@href ='/app?platform=ios']");
    public SelenideElement lockBypassButton = $x("//button[@class ='LockBypass_button__2-YuF auto_access_button Header_accessButton__2RDis']");
    public SelenideElement formatKoefSwitchButton = $x("//button[contains(@class, 'CurrentFormat_switchButton')]");
    public SelenideElement timezoneButton = $x("//button[contains(@class, 'CurrentTime_switchButton')]");
    public SelenideElement localeButton = $x("//button[contains(@class, 'CurrentLocale_switchButton']");
    public SelenideElement lockBPMostbetBookmarkButton = $x("//span[@class='TabsContent_buttonText__2zL8i']");

    //центральное меню (тоже в шапке сайта)
    public SelenideElement centralMenuLogo = $x("//a[@class='Header_logoLink__I0uRz']");
    public SelenideElement centralMenuLines = $x("//nav/a[@href='/pregame']");
    public SelenideElement centralMenuLive = $x("//nav/a[@href='/live']");
    public SelenideElement centralMenuCasino = $x("//nav/a[@href='/casino']");
    public SelenideElement centralMenuLiveCasino = $x("//nav/a[@href='/live-casino']");
    public SelenideElement centralMenuAviator = $x("//nav/a[@href='/aviator']");
    public SelenideElement centralMenuBuyBonus = $x("//a[@href='/casino/buy_bonus']");
    public SelenideElement centralMenuMore = $x("//button[contains(@class, 'Navigation_additionalNavButton')]"); // на БА нет кнопки "еще"
    public SelenideElement centralMenuMoreEscLoc = $x("//button[@class='TopBar_button__2aowZ']");
    public SelenideElement centralMenuCyberSport = $x("//a[@href='/esports']");
    public SelenideElement centralMenuFantasySport = $x("//a[@href='/fantasy-sport']");
    public SelenideElement centralMenuPoker = $x("//a[@href='/poker']");
    public SelenideElement centralMenuToto = $x("//a[@href='/toto']");

    //кнопки футера
    public SelenideElement footerLogoMostbet = $x("//a[@class='footer-logo__img']");
    public SelenideElement footerLogoBetAndreas = $x("//a[contains(@class, 'Footer_logo')]");
    public SelenideElement footerCallSupport = $x("//a[@class='DefaultPhoneButton_support__27VcZ']"); // на БА нет такого
    public SelenideElement footerAboutUs = $x("//a[@href='/about']");
    public SelenideElement footerRules = $x("//a[@href='/rules']");
    public SelenideElement footerContacts = $x("//a[@href='/contacts']");
    public SelenideElement footerMobileVersion = $x("//button[@class='Navigation_link__106Uj Navigation_nav__item__3oWGY']");
    public SelenideElement footerMostpartner = $x("//a[@href='https://mostpartner.com/']"); // на БА нет такого
    public SelenideElement footerFAQ = $x("//a[@href='/faq']");

    //линия и лайв
    public SelenideElement teamsInLineLoc = $x("//a[contains(@class, 'auto_center_line_team')]"); // !!! проверить на работоспособность
    public SelenideElement pregameTimerLoc = $x("//div[@class='PregameDetails_timer__1D30p']");
    public SelenideElement pregameFilterLoc = $x("//div[@class='Filter_root__1j2tG']");
    public SelenideElement liveMatchScoreLoc = $x("//div[@class='MatchScore_score__2O0Xb MatchScore_score_xxl__2TDhg']");
    public SelenideElement liveMatchInfo = $x("//nav[@class='Widgets_nav__IBty1']");




    //логика: подгружается 5 блоков линий, выбираем любой блок и жмем на коэф П1 у первого матча
    /*Random random = new Random();
    public By choosenLineAndOutcomeLoc = By.xpath(String
            .format("//div[@class='infinite-scroll-component ']/table[@class='LinesGroup_group__2GKc_'][%d]/tbody/tr[2]/td[4]",
                    random.nextInt(3) + 1));*/

    //левое меню
    public SelenideElement leftMenuSectionLoc = $x("//div[@class='LeftMenu_left__1c1BN']/nav[2]/div[7]"); // а почему именно 7 ?
    public SelenideElement leftMenuSectionButtonLoc  = $x("//div[@class='LeftMenu_left__1c1BN']/nav[2]/div[7]/button");
    public SelenideElement breadCrumbsLineLoc = $x("//div[@class='Breadcrumbs_root__2PA_g auto_breadcrumbs']/button"); // на БА немного по другому это выглядит
    public SelenideElement categoryIconOfLinesLoc = $x("//button[contains(@class, 'LinesGroup_catButton')]");


    //bets
    public SelenideElement firstLineAndOutcomeLoc = $x
            ("//div[@class='infinite-scroll-component ']/table[@class='LinesGroup_group__2GKc_'][1]/tbody/tr[2]/td[4]");
    public SelenideElement couponPreviewQuickBetsLoc = $x("//div[@class='QuickBetCoupon_root__JR18C']");
    public SelenideElement quickBetToggleLoc = $x("//div[contains(@class, 'toggleQuickBets')]//div[contains(@class, 'icon')]");
    public SelenideElement betCountLoc = $x("//input[@id='1']");
    public SelenideElement createBetLoc = $x("//div[@class='ExtendedCoupon_createCoupon__3JET-']/button");
    public SelenideElement betAcceptedLoc = $x("//p[contains(@class, 'couponInfoTitle')]");
    public SelenideElement couponIdLoc = $x("///div[contains(@class, 'SuccessCouponNumber_root')]");
    public SelenideElement widjetCasinoBannerLoc = $x("//div[@class='OuterBanner_innerContainer__1Cl8-'][1]");
    public SelenideElement buttonNextLoc = $x("//div[contains(@class,'DialogModal_info')]/button");


    //sports
    public SelenideElement tableTennisTopMenuLoc = $x("//div[contains(@class, 'swiper')]/button[@title='Table tennis']"); // только если локаль EN

    //personal account links
    public SelenideElement betsHistoryPersAccLoc = $x("//a[@href='/profile/history']");

    //bets history
    public SelenideElement couponTableLoc = $x("//table[@class='CouponTable_table__DYPc-']");
    //public SelenideElement lastCreatedCouponLoc = $x("//p[contains(text(),'" + TestData.getCouponId() + "')]");
    public SelenideElement toggleAllTimeLoc = $x("//div[@class='ToggleButton_icon__2ccUE FilterOfBets_toggleButtonIcon__2zt9O']");
    public SelenideElement showButtonLoc = $x("//div[contains(@class, 'FilterOfBets')]/button[2]w");
    public SelenideElement lastLoadedCouponLoc = $x("//table[@class='CouponTable_table__DYPc-']//tr[15]");  // а если нет 15 ставок на пользователе ?
    public SelenideElement loadedAfterScrollCouponLoc = $x("//table[@class='CouponTable_table__DYPc-']//tr[17]");

    //esports
    public SelenideElement firstLineEsportsLoc = $x("//div[@class='CyberLinesGroup_group__3iN-T'][1]");
    public SelenideElement esportsCategoriesCentralFirstLoc = $x("//div[@class='swiper-wrapper']/div[1]");
    public SelenideElement leftMenuFourEsportsLoc = $x("//div[@class='LeftMenu_left__1c1BN']//div[4]");  // почем именно 4 ? вот в данный момент на проде максимум 3 есть

    //casino
    public SelenideElement casinoFiltersLoc = $x("//div[@id='filtersBlock']");
    public SelenideElement casinoPopularGamesLoc = $x("//div[@class='PopularGames_root__xfB3n']");
    public SelenideElement casinoPromoLoc = $x("//section[contains(@class, 'PromoBanners')]");
    public SelenideElement casinoTopProvidersLocMB = $x("//section[@class='GameListLayout_root__2LrU1 ProvidersBanners_list__dPxeh']");
    public SelenideElement casinoTopProvidersLocBA = $x("//div[contains(@class, 'ProvidersBanners')][1]"); // на БА реализовано через /div вместе /sections
    public SelenideElement casinoAllGamesLoc = $x("//div[contains(@class, 'ListHeader_all_games')]");
    public SelenideElement casinoLeftMenuPromoLoc = $x("//a[@href='/promo/game_of_the_day'][1]");
    public SelenideElement casinoWinnersListLoc = $(byText("They Are Winning!")); //но только если локаль EN
    public SelenideElement casinoSliderLoc = $x("//div[@class='Slider_slider__2ZppQ']");
    public SelenideElement casinoLeftMenuVirtLoc = $x("//a[@href='/virtual-sport']");

    //live-casino
    public SelenideElement liveCasinoFiltersLoc = $x("//div[@id='filtersBlock']");
    public SelenideElement liveCasinoPopularGamesLoc = $x("//div[@class='TopGamesList_root__1WPXL']");
    public SelenideElement liveCasinoAllGamesLoc = $x("//div[@class='GamesList_root__2ghbL GamesList_isFilterEmpty__2563r GamesList_isHome__2h-6I']");
    public SelenideElement liveCasinoLeftMenuPromoLoc = $x("//a[@href='/promo/game_of_the_day'][1]"); // тоже самое что и casinoLeftMenuPromoLoc
    public SelenideElement liveCasinoWinnersListLoc = $x("They Are Winning!"); // то же самое что и casinoWinnersListLoc, тоже только если локаль EN
    public SelenideElement liveCasinoSliderLoc = $x("//div[@class='LiveCasinoHeader_slider__3cr-o']");

    //virtual sport
    public SelenideElement virtualSportFiltersLoc = $x("//div[@id='filtersBlock']");
    public SelenideElement virtualSportGamesLoc = $x("//div[@class='VirtualSportList_gameList__2GCRc']");
    public SelenideElement virtualSportLeftMenuPromoLoc = $x("//a[@href='/promo/game_of_the_day'][1]");
    public SelenideElement virtualSportWinnersListLoc = $x("They Are Winning!");
    public SelenideElement virtualSportSliderLoc = $x("//div[@class='Slider_slider__2ZppQ']");

    //promo
    public SelenideElement actionsPromoLinkLoc = $x("//a[@href='/promo']");
    public SelenideElement promoSliderLoc = $x("//div[@class='PromoActions_content__E_say']"); // на БА такого нет
    public SelenideElement promoNavigationLoc = $x("//div[@class='SectionNavigation_sectionNavigation__As97n']"); // на БА реализовано по-другому, нужно смотреть
    public SelenideElement promoContentLoc = $x("//div[contains(@class, 'cardsArray')]");

    //лендинги
    public SelenideElement regInfoLandLoc = $x("//div[@class='register-info']");

    //toto (только МБ)
    public SelenideElement totoJackpotLoc = $x("//div[@class='TotoHeader_content__UPMu6 Header_headerContent__1uJph']");
    public SelenideElement totoBetLoc = $x("//div[@class='DrawingSettings_form__1nGTQ']");
    public SelenideElement totoLinesLoc = $x("//div[@class='Toto_content__2oIcx']");
    public SelenideElement totoRulesLoc = $x("//div[@class='Rules_root__2DXAQ Toto_rules__29bgU']");

}
