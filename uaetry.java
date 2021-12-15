// STAR-CCM+ macro: uaetry.java
// Written by STAR-CCM+ 15.02.009
package macro;

import java.util.*;

import star.common.*;
import star.base.neo.*;
import star.vis.*;
import star.cadmodeler.*;

public class uaetry extends StarMacro {

  public void execute() {
    execute0();
    execute1();
    execute2();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_0 = 
      simulation_0.getSceneManager().createScene("3D-CAD View");

    scene_0.initializeAndWait();

    CadModel cadModel_0 = 
      simulation_0.get(SolidModelManager.class).createSolidModel(scene_0);

    cadModel_0.resetSystemOptions();

    scene_0.open();

    scene_0.setAdvancedRenderingEnabled(false);

    SceneUpdate sceneUpdate_0 = 
      scene_0.getSceneUpdate();

    HardcopyProperties hardcopyProperties_0 = 
      sceneUpdate_0.getHardcopyProperties();

    hardcopyProperties_0.setCurrentResolutionWidth(25);

    hardcopyProperties_0.setCurrentResolutionHeight(25);

    hardcopyProperties_0.setCurrentResolutionWidth(946);

    hardcopyProperties_0.setCurrentResolutionHeight(407);

    scene_0.resetCamera();

    ImportCadFileFeature importCadFileFeature_0 = 
      cadModel_0.importCadFile(resolvePath("/lustre/scratch/usr/tekajuna/ATLANTIS/star/shortSliding/geom/blade0.igs"), true, false, false, false, true, false, false, true, false, false, NeoProperty.fromString("{\'STEP\': 0, \'NX\': 0, \'CATIAV5\': 0, \'SE\': 0, \'JT\': 0}"));

    scene_0.resetCamera();

    CurrentView currentView_0 = 
      scene_0.getCurrentView();

    currentView_0.setInput(new DoubleVector(new double[] {-6.175977701753504, -0.32610776158196053, 5.367870998314835}), new DoubleVector(new double[] {-12.362390950545546, -0.6909085428375106, -1.0095382633591106}), new DoubleVector(new double[] {-0.10090725036748464, 0.9940496953100265, 0.041023530775876914}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {2.8101359051466632, 0.2927240693621077, 2.1538363235224134}), new DoubleVector(new double[] {-6.139516377546485, -0.23501955418736464, -7.072122735638919}), new DoubleVector(new double[] {-0.10090725036748464, 0.9940496953100265, 0.041023530775876914}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.5163132829623418, -0.014226150489891537, 0.686223772944512}), new DoubleVector(new double[] {-2.8255821908507737, -0.21129123985479245, -2.75884759379671}), new DoubleVector(new double[] {-0.10090725036748464, 0.9940496953100265, 0.041023530775876914}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.4050762397149825, -0.05244107400765011, 0.8365497991414197}), new DoubleVector(new double[] {-1.3855576861814862, -0.1580312809401199, -1.0093672005852818}), new DoubleVector(new double[] {-0.10090725036748464, 0.9940496953100265, 0.041023530775876914}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {3.092809750326331E-4, -0.04325658766710836, 0.49861179430463753}), new DoubleVector(new double[] {-0.447658964344104, -0.06967240557290509, 0.0368132170447166}), new DoubleVector(new double[] {-0.10090725036748464, 0.9940496953100265, 0.041023530775876914}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.013438034969339596, -0.042605949284185145, 0.5134044168649263}), new DoubleVector(new double[] {-0.3729917184338544, -0.053123246487169797, -0.009952230491400926}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.013438034969339596, -0.042605949284185145, 0.5134044168649263}), new DoubleVector(new double[] {-0.3729917184338544, -0.053123246487169797, -0.009952230491400926}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.013438034969339596, -0.042605949284185145, 0.5134044168649263}), new DoubleVector(new double[] {-0.3729917184338544, -0.053123246487169797, -0.009952230491400926}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.09505904342941453, -0.027409819606335345, 0.49824115673811153}), new DoubleVector(new double[] {-0.10461643668697528, -0.03284430375264686, 0.22781298987813425}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.12870293279898032, -0.021321548571224844, 0.5037105954413144}), new DoubleVector(new double[] {-0.013964172294846325, -0.025204459584538187, 0.3104910590252533}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.14031260615825336, -0.017739332489131183, 0.5048775910532675}), new DoubleVector(new double[] {0.02045476170206491, -0.02100145338213492, 0.34254951180597076}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.14031260615825336, -0.017739332489131183, 0.5048775910532675}), new DoubleVector(new double[] {0.02045476170206491, -0.02100145338213492, 0.34254951180597076}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.026832870776033024, -0.0692277038117628, 0.6767307793881033}), new DoubleVector(new double[] {-0.4831559053461889, -0.08310785533070503, -0.013966594999105394}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.026832870776033024, -0.0692277038117628, 0.6767307793881033}), new DoubleVector(new double[] {-0.4831559053461889, -0.08310785533070503, -0.013966594999105394}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    star.cadmodeler.Body cadmodelerBody_0 = 
      ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));

    Face face_0 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.1342203898327811, 0.06282857617321425, 3.148999968942829})));

    Edge edge_0 = 
      ((Edge) cadModel_0.getEdgeByLocation(face_0,new DoubleVector(new double[] {0.194040238879, 0.009318364384039999, 0.508, 0.08038350773854595, 0.1115926784685944, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));

    Face face_1 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.14178339473479024, -0.05069026328718468, 3.148999968942829})));

    Edge edge_1 = 
      ((Edge) cadModel_0.getEdgeByLocation(face_1,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.08718135532034405, -0.1062827769549357, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));

    Face face_2 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.45550578972005196, 0.023712995610485933, 3.1489999689428294})));

    Edge edge_2 = 
      ((Edge) cadModel_0.getEdgeByLocation(face_2,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.19414059921, 0.0061504782198899995, 0.508, 0.194040238879, 0.009318364384039999, 0.508})));

    FillFeature fillFeature_0 = 
      cadModel_0.getFeatureManager().createFillFeature(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}), new NeoObjectVector(new Object[] {}));

    fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));

    cadModel_0.allowMakingPartDirty(false);

    fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));

    fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));

    fillFeature_0.setIsAllEdgesTangent(false);

    fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));

    fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());

    fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());

    fillFeature_0.setColorVector(new IntVector(new int[] {-16711936, -16776961, -14336}));

    cadModel_0.allowMakingPartDirty(true);

    fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));

    fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));

    fillFeature_0.setIsAllEdgesTangent(false);

    fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));

    fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());

    fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());

    fillFeature_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(fillFeature_0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    Face face_3 = 
      ((Face) fillFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.08855328562561882, 0.018382443857779318, 0.508000000000002})));

    ReferencePointFromEntityCenter referencePointFromEntityCenter_0 = 
      cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);

    cadModel_0.allowMakingPartDirty(false);

    referencePointFromEntityCenter_0.setColorVector(new IntVector(new int[] {-16711936}));

    cadModel_0.allowMakingPartDirty(true);

    referencePointFromEntityCenter_0.setEntity(face_3);

    referencePointFromEntityCenter_0.setCenterPointType(0);

    referencePointFromEntityCenter_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_0);

    MoveBodyFeature moveBodyFeature_0 = 
      cadModel_0.getFeatureManager().createMoveBodyFeature();

    cadModel_0.allowMakingPartDirty(false);

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    moveBodyFeature_0.setIsBodyGroupCreation(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    moveBodyFeature_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -65536}));

    cadModel_0.allowMakingPartDirty(true);

    moveBodyFeature_0.setDirectionOption(0);

    moveBodyFeature_0.setCoordinateSystemSourceOption(1);

    CanonicalReferenceCoordinateSystem canonicalReferenceCoordinateSystem_0 = 
      ((CanonicalReferenceCoordinateSystem) cadModel_0.getFeature("Lab Coordinate System"));

    moveBodyFeature_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    moveBodyFeature_0.setImportedCoordinateSystem(labCoordinateSystem_0);

    moveBodyFeature_0.getTranslationVector().setCoordinateSystem(labCoordinateSystem_0);

    moveBodyFeature_0.getTranslationVector().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {-0.08538299661646141, -0.0027048856593682464, 0.0}));

    moveBodyFeature_0.setCopyOption(0);

    moveBodyFeature_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));

    moveBodyFeature_0.setBodyGroups(new NeoObjectVector(new Object[] {}));

    moveBodyFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));

    moveBodyFeature_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(moveBodyFeature_0);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    ReferencePointFromEntityCenter referencePointFromEntityCenter_1 = 
      cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);

    cadModel_0.allowMakingPartDirty(false);

    referencePointFromEntityCenter_1.setColorVector(new IntVector(new int[] {-16711936}));

    cadModel_0.allowMakingPartDirty(true);

    referencePointFromEntityCenter_1.setEntity(face_3);

    referencePointFromEntityCenter_1.setCenterPointType(0);

    referencePointFromEntityCenter_1.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_1);

    currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.28251210288124984, -0.26198345401879936, 0.9231343846863616}), new DoubleVector(new double[] {-2.2038793635835696, -0.314276504279364, -1.6790470442684433}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.26115408999658074, -0.30571458708595234, 1.2217890300136798}), new DoubleVector(new double[] {-2.746447758161563, -0.37335578685018106, -2.144139577739284}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.9407008555192151, -0.6991162796265088, 1.496447363516617}), new DoubleVector(new double[] {-1.0776829699067405, 0.3596723939955772, 4.2225215652645485}), new DoubleVector(new double[] {0.4158623626928828, 0.9027719848005871, 0.10982367119481405}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {3.245402540089241, -1.2373390989628095, 3.983228602819711}), new DoubleVector(new double[] {-2.8970566874852106, 0.9173127394008908, 9.530833083908593}), new DoubleVector(new double[] {0.4158623626928828, 0.9027719848005871, 0.10982367119481405}), 2.3015422693647807, 0, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 5.010918682998895}), new DoubleVector(new double[] {-0.36173756731264695, 0.5210279870707235, 10.69255901822641}), new DoubleVector(new double[] {0.49440568318297695, 0.8692258315807572, -0.003078010579394841}), 2.3015422693647807, 0, 30.0);

    RotateBodyFeature rotateBodyFeature_0 = 
      cadModel_0.getFeatureManager().createRotateBodyFeature();

    cadModel_0.allowMakingPartDirty(false);

    rotateBodyFeature_0.setIsBodyGroupCreation(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    rotateBodyFeature_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -65536}));

    cadModel_0.allowMakingPartDirty(true);

    rotateBodyFeature_0.setRotationAxisOption(0);

    rotateBodyFeature_0.setCoordinateSystemSourceOption(1);

    rotateBodyFeature_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);

    rotateBodyFeature_0.setImportedCoordinateSystem(labCoordinateSystem_0);

    rotateBodyFeature_0.getAxis().setCoordinateSystem(labCoordinateSystem_0);

    rotateBodyFeature_0.getPosition().setCoordinateSystem(labCoordinateSystem_0);

    rotateBodyFeature_0.getAxis().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 1.0}));

    rotateBodyFeature_0.getPosition().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    rotateBodyFeature_0.getAngle().setValue(-90.0);

    rotateBodyFeature_0.setCopyOption(0);

    rotateBodyFeature_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));

    rotateBodyFeature_0.setBodyGroups(new NeoObjectVector(new Object[] {}));

    rotateBodyFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));

    rotateBodyFeature_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(rotateBodyFeature_0);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    scene_0.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_0.setInput(new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 5.010918682998895}), new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.6348409552845689, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.3969211116720397, -0.3063583956373198, 5.01091867666684}), new DoubleVector(new double[] {1.3969211116720397, -0.3063583956373198, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.6348409552845689, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.8748428244030544, -0.3714088509812634, 1.206129400176028}), new DoubleVector(new double[] {1.8748428244030544, -0.3714088509812634, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 2.1662071676531, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.6532125344012092, -0.1864191213524125, 4.998590063444838}), new DoubleVector(new double[] {0.6532125344012092, -0.1864191213524125, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 0.7745701570056043, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.5885064279191685, -0.16263011161636814, 5.005831020669464}), new DoubleVector(new double[] {0.5885064279191685, -0.16263011161636814, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 0.6976351689998784, 1, 30.0);

    BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
      cadModel_0.getFeatureManager().createBodyCircularPatternMerge();

    cadModel_0.allowMakingPartDirty(false);

    currentView_0.setInput(new DoubleVector(new double[] {0.7634980445482978, -0.17137969244782458, 4.98228641408272}), new DoubleVector(new double[] {0.7634980445482978, -0.17137969244782458, 15.350967410597217}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.0210059676152476, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18475811210664939, -0.1964658341582728, 4.989090430426716}), new DoubleVector(new double[] {-0.18475811210664939, -0.1964658341582728, 15.357771487125907}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.0210059676152476, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.23704405398852635, -0.1997504148754689, 5.286126831575637}), new DoubleVector(new double[] {-3.777220984316129, -0.42214282978282414, 15.02918772168016}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 1.0210059676152476, 1, 30.0);

    bodyCircularPatternMerge_0.setColorVector(new IntVector(new int[] {-16711936, -16776961, -65536, -65536}));

    cadModel_0.allowMakingPartDirty(true);

    bodyCircularPatternMerge_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));

    bodyCircularPatternMerge_0.setBodyGroups(new NeoObjectVector(new Object[] {}));

    bodyCircularPatternMerge_0.setCadFilters(new NeoObjectVector(new Object[] {}));

    bodyCircularPatternMerge_0.getNumberCopy().setValue(2.0);

    bodyCircularPatternMerge_0.setIsEven(true);

    bodyCircularPatternMerge_0.setRotationAxisOption(0);

    bodyCircularPatternMerge_0.setCoordinateSystemSourceOption(1);

    bodyCircularPatternMerge_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);

    bodyCircularPatternMerge_0.setImportedCoordinateSystem(labCoordinateSystem_0);

    bodyCircularPatternMerge_0.getDirection().setCoordinateSystem(labCoordinateSystem_0);

    bodyCircularPatternMerge_0.getPosition().setCoordinateSystem(labCoordinateSystem_0);

    bodyCircularPatternMerge_0.getDirection().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    bodyCircularPatternMerge_0.getPosition().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    bodyCircularPatternMerge_0.setSkipPositionsPair(new IntVector(new int[] {}));

    bodyCircularPatternMerge_0.setPostOption(0);

    bodyCircularPatternMerge_0.setInteractingBodies(new NeoObjectVector(new Object[] {}));

    bodyCircularPatternMerge_0.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));

    bodyCircularPatternMerge_0.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));

    bodyCircularPatternMerge_0.setInteractingSelectedBodies(false);

    bodyCircularPatternMerge_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(bodyCircularPatternMerge_0);

    currentView_0.setInput(new DoubleVector(new double[] {1.1586687778018756, -0.4849872935165104, 5.031914172254121}), new DoubleVector(new double[] {-2.6236823435804797, -0.7225929885047336, 15.441472227866106}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 1.7917689604735816, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.36360165311443976, -0.12510429959810523, 4.560374126135576}), new DoubleVector(new double[] {-4.122414235016751, -0.3612313135086925, 14.905150836653332}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.7851957198320169, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);

    star.cadmodeler.Body cadmodelerBody_1 = 
      ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));

    Face face_4 = 
      ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.01567755819841113, 0.0031702890091573656, -0.508000000000002})));

    ReferencePointFromEntityCenter referencePointFromEntityCenter_2 = 
      cadModel_0.getFeatureManager().createPointFromEntityCenter(face_4);

    cadModel_0.allowMakingPartDirty(false);

    referencePointFromEntityCenter_2.setColorVector(new IntVector(new int[] {-16711936}));

    cadModel_0.allowMakingPartDirty(true);

    referencePointFromEntityCenter_2.setEntity(face_4);

    referencePointFromEntityCenter_2.setCenterPointType(0);

    referencePointFromEntityCenter_2.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_2);

    currentView_0.setInput(new DoubleVector(new double[] {0.22976705095474226, -0.1499866480320085, 3.879919071527893}), new DoubleVector(new double[] {-3.81634445148321, -0.4041616584115984, 15.01538249955414}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.9936954078913447, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.6151568187859502, -0.02641259616100549, 3.4875443657403915}), new DoubleVector(new double[] {-4.689561951799853, -0.28236500042630147, 14.70087581305744}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.7419689095167055, -0.006760264069081812, 3.257997133700349}), new DoubleVector(new double[] {-4.8753802899905, -0.26641941580081363, 14.633722007451347}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.6866350325660149, -0.003620418302799966, 3.0977094150657627}), new DoubleVector(new double[] {-6.217105618701935, -0.5284336659343895, 14.096688895885492}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.2065989002744875, -0.023283834565328565, 2.544874226781542}), new DoubleVector(new double[] {-6.853429279164482, -0.5591390287687146, 13.77526963377993}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.2065989002744875, -0.023283834565328565, 2.544874226781542}), new DoubleVector(new double[] {-6.853429279164482, -0.5591390287687146, 13.77526963377993}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.1569552103870868, -0.004653967640237011, 2.018827322197171}), new DoubleVector(new double[] {-7.024885889273078, -0.5614904444824105, 13.688946189429743}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-1.0102666289720874, 0.012391978161924805, 1.6637319753283846}), new DoubleVector(new double[] {-13.0763713258073, -0.25201856201349415, 7.811380679475211}), new DoubleVector(new double[] {-0.004719869621461602, 0.9994201298745649, 0.03372131124774841}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.7663131233601841, 0.04561760299343612, 0.3750161929131872}), new DoubleVector(new double[] {-13.547680063965373, -0.2344668336874478, 6.887089134750484}), new DoubleVector(new double[] {-0.004719869621461602, 0.9994201298745649, 0.03372131124774841}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.6546931476000445, 0.06323614228108057, 0.13380351311382904}), new DoubleVector(new double[] {-14.656964642138234, 0.7667680636328684, -5.007815988766799}), new DoubleVector(new double[] {0.038756247998701525, 0.9987641084044023, 0.03111605701607553}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.6546931476000445, 0.06323614228108057, 0.13380351311382904}), new DoubleVector(new double[] {-14.656964642138234, 0.7667680636328684, -5.007815988766799}), new DoubleVector(new double[] {0.038756247998701525, 0.9987641084044023, 0.03111605701607553}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    FaceSketch faceSketch_0 = 
      cadModel_0.getFeatureManager().convertToSketch(face_3);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);

    faceSketch_0.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_0, true);

    faceSketch_0.setIsUptoDate(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);

    FaceSketch faceSketch_1 = 
      cadModel_0.getFeatureManager().convertToSketch(face_4);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_1);

    faceSketch_1.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_1, true);

    faceSketch_1.setIsUptoDate(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    currentView_0.setInput(new DoubleVector(new double[] {-0.03935260793846673, 0.037290851520660306, 0.23179305628394964}), new DoubleVector(new double[] {-10.89686196499068, 5.125654722139667, 10.115717923355591}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3481226156630169, 1, 30.0);

    LoftMerge loftMerge_0 = 
      (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}), new NeoObjectVector(new Object[] {}));

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    loftMerge_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));

    cadModel_0.allowMakingPartDirty(true);

    loftMerge_0.setProfileSketches(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}));

    loftMerge_0.setLoftedBodyTypeOption(0);

    loftMerge_0.setGuideSketches(new NeoObjectVector(new Object[] {}));

    loftMerge_0.setProfileAlignmentType(0);

    loftMerge_0.setBoundaryContactTypeStart(0);

    loftMerge_0.setBoundaryContactTypeEnd(0);

    loftMerge_0.setProfileSortingType(0);

    loftMerge_0.setSectionProfileType(0);

    loftMerge_0.setRefitType(0);

    loftMerge_0.setTolerance(1.0E-5);

    loftMerge_0.setPeriodicity(false);

    loftMerge_0.setCompatibilityMode(false);

    loftMerge_0.setPostOption(0);

    loftMerge_0.setInteractingBodies(new NeoObjectVector(new Object[] {}));

    loftMerge_0.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));

    loftMerge_0.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));

    loftMerge_0.setInteractingSelectedBodies(false);

    loftMerge_0.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(loftMerge_0);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    UniteBodiesFeature uniteBodiesFeature_0 = 
      cadModel_0.getFeatureManager().createUniteBodies();

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    uniteBodiesFeature_0.setAutoPreview(true);

    cadModel_0.getFeatureManager().deleteOnCancel(uniteBodiesFeature_0);

    cadModel_0.allowMakingPartDirty(true);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  }

  private void execute1() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("3D-CAD View 1");

    CurrentView currentView_0 = 
      scene_0.getCurrentView();

    currentView_0.setInput(new DoubleVector(new double[] {-1.2632846788203513, 0.12763315677556275, -0.9730365539212423}), new DoubleVector(new double[] {-12.038054874570648, 5.177221379572489, 8.835568308628234}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 2.121816967526483, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.4877641465546114, -0.3943387687398907, -0.8100510719391842}), new DoubleVector(new double[] {-11.188860756438963, 5.077903007277669, 9.819539881828133}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 1.2627519708409278, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.7476563007210291, -0.3109587931314379, 0.26828248837031043}), new DoubleVector(new double[] {-10.557533114742881, 4.98721001155738, 10.559744288297871}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.6059520628256903, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.5066642327230002, -0.08991999192921118, 1.1721174452272922}), new DoubleVector(new double[] {-10.228613063976297, 4.9411599124248164, 10.944770706524004}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.26106956879066534, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.27766031159510507, 0.05855036763876542, 1.6185257255505348}), new DoubleVector(new double[] {-10.113452628226973, 4.928337896227866, 11.07787558240772}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.11239455858243907, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.27766031159510507, 0.05855036763876542, 1.6185257255505348}), new DoubleVector(new double[] {-10.113452628226973, 4.928337896227866, 11.07787558240772}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.11239455858243907, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.19019886525409468, 0.07707554564909758, 1.625610114072403}), new DoubleVector(new double[] {-10.15082830648876, 4.923390415422484, 11.039365355044405}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.1991119514288837, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.2465623373604522, 0.09369644637352459, 1.7040397720102223}), new DoubleVector(new double[] {-10.083322691984971, 4.934789559208745, 11.10765197789997}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.06942803973032069, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.29533513124104593, 0.005251280146320536, 1.1651002016248295}), new DoubleVector(new double[] {-10.620418975956053, 4.84409432129326, 10.564341741406981}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 1.1006761165216363, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.2502131064387045, -0.5372078700024769, 2.9374491722747975}), new DoubleVector(new double[] {-9.165845889620925, 4.344270609715407, 12.419508191746857}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 1.1006761165216363, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.5464047216085007, -0.10340530548217997, 3.607419997912986}), new DoubleVector(new double[] {-4.406139978229218, 11.137174020657188, 10.627311299325129}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 1.1006761165216363, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.02317992618590803, 0.19558037436016718, 4.675282311082928}), new DoubleVector(new double[] {-4.5966086949643525, 10.68091743103269, 11.223514769648757}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 0.22700386097573505, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.042731103329648856, 0.141427869843612, 4.760847731674746}), new DoubleVector(new double[] {-4.579652435452256, 10.632654500311244, 11.312758307413517}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 0.14895138027957164, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.0013892457520303103, 0.15686098411943816, 4.858282883584298}), new DoubleVector(new double[] {-4.594711769841736, 10.58843529346879, 11.37293979134232}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 0.08795803947027064, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.00308608803435223, 0.15786959850686366, 4.87108896236874}), new DoubleVector(new double[] {-4.596133808599799, 10.582513974447828, 11.381418034537385}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.012942075126196606, 0.11195354482130515, 4.955919875225299}), new DoubleVector(new double[] {-4.580105631856479, 10.536597889934034, 11.466248928141304}), new DoubleVector(new double[] {0.7425531932368452, 0.5582735577534194, -0.37006133265597274}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.00979949001194727, 0.12342718355116845, 4.963964932367168}), new DoubleVector(new double[] {-1.0781783901002613, 10.4403165858871, 12.997132335721002}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.07916254482262536, 1, 30.0);

    CadModel cadModel_0 = 
      ((CadModel) simulation_0.get(SolidModelManager.class).getObject("3D-CAD Model 1"));

    ImportCadFileFeature importCadFileFeature_0 = 
      ((ImportCadFileFeature) cadModel_0.getFeature("ImportCad 1"));

    star.cadmodeler.Body cadmodelerBody_0 = 
      ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));

    Face face_0 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.06012369051384599, -0.04883739321631973, 3.148999968942829})));

    Face face_1 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {-0.05339514894655294, -0.05640039811832881, 3.148999968942829})));

    Edge edge_3 = 
      ((Edge) cadModel_0.getEdgeByLocation(new NeoObjectVector(new Object[] {face_0, face_1})));

    cadModel_0.setEdgeNameAttributes(new NeoObjectVector(new Object[] {edge_3}), "LE");

    currentView_0.setInput(new DoubleVector(new double[] {0.3410957929066719, -0.12590880334765564, 5.222450914057512}), new DoubleVector(new double[] {-0.7522940764390621, 10.242300479097564, 13.295578151423387}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.3652088728571031, 1.5738515315629522, 2.788778028768734}), new DoubleVector(new double[] {-1.4664695453055905, 12.01669671111878, 10.920019939308606}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.04737564840081854, 1.2301507394451425, 1.7982676683858392}), new DoubleVector(new double[] {-1.2235175170484922, 12.383066439388706, 10.482400584733115}), new DoubleVector(new double[] {0.7759145471332933, 0.4364706126521607, -0.4554668152983186}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.45384863329285774, 1.3539879225821418, 2.0702703059645717}), new DoubleVector(new double[] {12.949758877945282, 4.846039267743022, 9.181189419773851}), new DoubleVector(new double[] {0.48448538790966594, 0.04530146551381065, -0.8736255983682778}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {1.3798776429883262, 0.63867899287788, 3.0142853293445873}), new DoubleVector(new double[] {5.956920941741847, -11.296606746535373, 11.276509793660395}), new DoubleVector(new double[] {0.7980380488906778, -0.104764981394589, -0.5934303423285375}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.2155811878983217, -0.4482413367447502, 1.9448977011478359}), new DoubleVector(new double[] {4.4239995364370674, -12.546602230795528, 10.320011254303715}), new DoubleVector(new double[] {0.7980380488906778, -0.104764981394589, -0.5934303423285375}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.1910687709043653, -0.5100619795033612, 1.9850070289126132}), new DoubleVector(new double[] {5.199129696193258, -13.151704893729669, 8.92655808800578}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.7794771876785296, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.05920820014358008, -0.45486333925169564, 2.007850644925707}), new DoubleVector(new double[] {5.327090066516115, -13.087359105830071, 8.944378987203187}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.41428517302205825, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.041523275772092694, -0.4592712229600995, 1.9657494157202386}), new DoubleVector(new double[] {5.347985675203546, -13.09929701368883, 8.906412509111206}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.2446340306309453, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.02509200755822194, -0.45007280992382137, 1.954137811826476}), new DoubleVector(new double[] {5.366879939323617, -13.095875069726084, 8.897972775779465}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.1444542889353084, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.02509200755822194, -0.45007280992382137, 1.954137811826476}), new DoubleVector(new double[] {5.366879939323617, -13.095875069726084, 8.897972775779465}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.1444542889353084, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.02509200755822194, -0.45007280992382137, 1.954137811826476}), new DoubleVector(new double[] {5.366879939323617, -13.095875069726084, 8.897972775779465}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.1444542889353084, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.02509200755822194, -0.45007280992382137, 1.954137811826476}), new DoubleVector(new double[] {5.366879939323617, -13.095875069726084, 8.897972775779465}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 0.1444542889353084, 1, 30.0);

    Face face_2 = 
      ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.021008109951117543, -0.37012279310359053, 3.1489999689428294})));

    cadModel_0.setFaceNameAttributes(new NeoObjectVector(new Object[] {face_2}), "TE");

    currentView_0.setInput(new DoubleVector(new double[] {0.07523211423378051, -0.03520471967057759, 2.522289991526999}), new DoubleVector(new double[] {5.4844851747063075, -12.721536408677945, 9.488379744998404}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 1.564013654796091, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.6797194852570554, -1.3628582125163677, -0.36496486302604825}), new DoubleVector(new double[] {6.088972516679723, -14.049189833393042, 6.601124853034656}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 1.564013654796091, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.3263926317562533, 0.28153828963919914, -2.97124490539706}), new DoubleVector(new double[] {6.663017068157786, -14.579759285120012, 5.189122905932001}), new DoubleVector(new double[] {0.7660968733742106, -0.025981456908162052, -0.6421997699339369}), 1.564013654796091, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.35335654662413385, 0.18328774749741994, -2.910425840213405}), new DoubleVector(new double[] {3.4096862664101626, -14.801383528468719, 6.851345801063791}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 1.564013654796091, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.085282297101334, 0.20606931880073165, -2.9061853700384632}), new DoubleVector(new double[] {3.152004582823654, -14.829554962419053, 6.888779632144866}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 1.026482941602065, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.028908803738472932, 0.209151288905566, -2.871890446067646}), new DoubleVector(new double[] {3.0383743683662074, -14.829222924040636, 6.924866000522304}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.6061607047225822, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10904947326454734, 0.1954080341944331, -2.868450892396706}), new DoubleVector(new double[] {2.958284041487799, -14.843213000297741, 6.928466346213537}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.23484252860734972, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10904947326454734, 0.1954080341944331, -2.868450892396706}), new DoubleVector(new double[] {2.958284041487799, -14.843213000297741, 6.928466346213537}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.23484252860734972, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10904947326454734, 0.1954080341944331, -2.868450892396706}), new DoubleVector(new double[] {2.958284041487799, -14.843213000297741, 6.928466346213537}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.23484252860734972, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10904947326454734, 0.1954080341944331, -2.868450892396706}), new DoubleVector(new double[] {2.958284041487799, -14.843213000297741, 6.928466346213537}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.23484252860734972, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10904947326454734, 0.1954080341944331, -2.868450892396706}), new DoubleVector(new double[] {2.958284041487799, -14.843213000297741, 6.928466346213537}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.23484252860734972, 1, 30.0);

    BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
      ((BodyCircularPatternMerge) cadModel_0.getFeature("Circular Pattern 1"));

    star.cadmodeler.Body cadmodelerBody_1 = 
      ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));

    Face face_5 = 
      ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.06012369051384599, 0.048837393216319344, -3.148999968942829})));

    Face face_6 = 
      ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {-0.05339514894655294, 0.05640039811832842, -3.148999968942829})));

    Edge edge_4 = 
      ((Edge) cadModel_0.getEdgeByLocation(new NeoObjectVector(new Object[] {face_5, face_6})));

    cadModel_0.setEdgeNameAttributes(new NeoObjectVector(new Object[] {edge_4}), "LEoff");

    currentView_0.setInput(new DoubleVector(new double[] {-0.09880921660766223, -0.3827626495484222, -2.8139637894976044}), new DoubleVector(new double[] {2.8828540131052125, -15.00135666564525, 6.7093266366701005}), new DoubleVector(new double[] {0.8171788745647383, -0.1882251645036209, -0.5447843375251422}), 0.503337386953691, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.13302522676892092, -0.7109226444873757, -2.4783992663586485}), new DoubleVector(new double[] {11.844777126746429, -6.890740944209048, 9.266019372372497}), new DoubleVector(new double[] {0.7014342195528518, -0.024389526873160913, -0.7123167740683914}), 0.503337386953691, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.14779659954421476, 0.6330633593009747, -2.506398935544283}), new DoubleVector(new double[] {12.175866391362751, -5.713663112077947, 9.555219877544127}), new DoubleVector(new double[] {0.7014342195528518, -0.024389526873160913, -0.7123167740683914}), 0.503337386953691, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.11723566098313118, 0.5780037001352893, -2.597291456980166}), new DoubleVector(new double[] {1.7403138076493707, 13.121429002100394, 10.371011000783378}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.503337386953691, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.06638604506405574, 0.33649293471094377, -2.7985365466443417}), new DoubleVector(new double[] {1.7177647283029427, 13.098629619879418, 10.395885595340765}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.2674955009134843, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.06135112796949169, 0.3996942450313854, -2.728791602241647}), new DoubleVector(new double[] {1.7043754289911708, 13.097266836658921, 10.398879499035377}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.17550395337345748, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.06135112796949169, 0.3996942450313854, -2.728791602241647}), new DoubleVector(new double[] {1.7043754289911708, 13.097266836658921, 10.398879499035377}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.17550395337345748, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.06135112796949169, 0.3996942450313854, -2.728791602241647}), new DoubleVector(new double[] {1.7043754289911708, 13.097266836658921, 10.398879499035377}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.17550395337345748, 1, 30.0);

    Face face_7 = 
      ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.021008109951117543, 0.3701227931035901, -3.1489999689428294})));

    cadModel_0.setFaceNameAttributes(new NeoObjectVector(new Object[] {face_7}), "TEoff");

    currentView_0.setInput(new DoubleVector(new double[] {-0.02573595855135255, 0.6006315116949563, -2.9286879454143397}), new DoubleVector(new double[] {1.618342982642853, 13.306354542814091, 10.207409671104433}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.4551593766972601, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1852127061184532, -0.2905810805974003, -2.236450547642595}), new DoubleVector(new double[] {1.83848819375289, 12.48621443310431, 10.973126954024494}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.4551593766972601, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.20507964301203085, -1.0354742795370084, -1.5184485857008863}), new DoubleVector(new double[] {1.8583551306464674, 11.7413212341647, 11.6911289159662}), new DoubleVector(new double[] {0.9711217381931331, 0.09884224551660395, -0.21714690905007125}), 0.4551593766972601, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.2485137272790715, -0.7307953658083068, -1.2018160551566248}), new DoubleVector(new double[] {5.464845059491758, 10.492419246659555, 11.934910636173752}), new DoubleVector(new double[] {0.9358773409720518, -0.023499760448679092, -0.3515414113784522}), 0.4551593766972601, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.1323317672282327, -0.8468156633171935, -0.7318690414629074}), new DoubleVector(new double[] {5.0378031351086365, 10.277004870476187, 12.288517288271542}), new DoubleVector(new double[] {0.9358773409720518, -0.023499760448679092, -0.3515414113784522}), 0.4551593766972601, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.05210088234800048, -0.6639714107838597, -0.5752598954165984}), new DoubleVector(new double[] {5.045525450239505, 10.303843074368624, 12.262521993972108}), new DoubleVector(new double[] {0.9358773409720518, -0.023499760448679092, -0.3515414113784522}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.07516795245847646, -0.5145833077536364, -0.311966683930017}), new DoubleVector(new double[] {9.620052473401458, -0.34194850560994766, 14.362130668850247}), new DoubleVector(new double[] {0.8345880281435857, -0.1001968649939517, -0.5416857128675316}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.07376762681647624, -0.5144869732245885, -0.3146133280442961}), new DoubleVector(new double[] {7.311784067748656, -1.5605225535584741, 15.590077943823065}), new DoubleVector(new double[] {0.9026798330999061, -0.1037405332116786, -0.41762066601606823}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1386876738862852, -0.4671277810635521, -0.1840098200002069}), new DoubleVector(new double[] {6.75392032134575, 10.406659515764431, 11.839784714869085}), new DoubleVector(new double[] {0.9072949778479931, -0.10046690034015959, -0.40831632971004067}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1386876738862852, -0.4671277810635521, -0.1840098200002069}), new DoubleVector(new double[] {6.75392032134575, 10.406659515764431, 11.839784714869085}), new DoubleVector(new double[] {0.9072949778479931, -0.10046690034015959, -0.40831632971004067}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1386876738862852, -0.4671277810635521, -0.1840098200002069}), new DoubleVector(new double[] {6.75392032134575, 10.406659515764431, 11.839784714869085}), new DoubleVector(new double[] {0.9072949778479931, -0.10046690034015959, -0.40831632971004067}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1386876738862852, -0.4671277810635521, -0.1840098200002069}), new DoubleVector(new double[] {6.75392032134575, 10.406659515764431, 11.839784714869085}), new DoubleVector(new double[] {0.9072949778479931, -0.10046690034015959, -0.40831632971004067}), 0.5507375089225264, 1, 30.0);

    LoftMerge loftMerge_0 = 
      ((LoftMerge) cadModel_0.getFeature("Loft 1"));

    cadModel_0.getFeatureManager().rollBack(loftMerge_0, true);

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    loftMerge_0.setAutoPreview(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(true);

    cadModel_0.allowMakingPartDirty(true);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    cadModel_0.getFeatureManager().delete(loftMerge_0);

    cadModel_0.allowMakingPartDirty(false);

    FaceSketch faceSketch_0 = 
      ((FaceSketch) cadModel_0.getFeature("FaceSketch 1"));

    cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);

    currentView_0.setInput(new DoubleVector(new double[] {0.10529605970233774, 0.2731053907878729, -0.12467341937883894}), new DoubleVector(new double[] {-7.542260547938222, 12.284087891322212, -10.314048348325764}), new DoubleVector(new double[] {0.8917173446501833, 0.2448612595396551, -0.38063518075279057}), 0.5507375089225264, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.026249922681887194, 0.0814402110089485, 0.44454271127319966}), new DoubleVector(new double[] {-7.808335442815397, 12.386163477773048, -9.994023722107109}), new DoubleVector(new double[] {0.8917173446501833, 0.2448612595396551, -0.38063518075279057}), 0.09187128702924614, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.039492610926293525, 0.06448282593288979, 0.46744508621467595}), new DoubleVector(new double[] {-7.808521095484128, 12.390296171004845, -9.98901286562801}), new DoubleVector(new double[] {0.8917173446501833, 0.2448612595396551, -0.38063518075279057}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.007390687108741023, 0.03055691984084241, 0.4905676458831465}), new DoubleVector(new double[] {-7.862502479315664, 12.36751826795, -9.975347582468766}), new DoubleVector(new double[] {0.8917173446501833, 0.2448612595396551, -0.38063518075279057}), 0.08268422507514331, 1, 30.0);

    ParasolidSketchPrimitive parasolidSketchPrimitive_0 = 
      ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 3"));

    ParasolidSketchPrimitive parasolidSketchPrimitive_1 = 
      ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 2"));

    ParasolidSketchPrimitive parasolidSketchPrimitive_2 = 
      ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 1"));

    faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0, parasolidSketchPrimitive_1, parasolidSketchPrimitive_2}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));

    currentView_0.setInput(new DoubleVector(new double[] {-0.007390687108741023, 0.03055691984084241, 0.4905676458831465}), new DoubleVector(new double[] {-7.862502479315664, 12.36751826795, -9.975347582468766}), new DoubleVector(new double[] {0.8917173446501833, 0.2448612595396551, -0.38063518075279057}), 0.08268422507514331, 1, 30.0);

    faceSketch_0.startSketchQuickTrim();

    faceSketch_0.cancelSketchQuickTrim();

    cadModel_0.getFeatureManager().cancelSketchEdit(faceSketch_0);

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(true);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0, parasolidSketchPrimitive_1, parasolidSketchPrimitive_2}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.024760791370036034, 0.05669773324043215, 0.4487369296692331}), new DoubleVector(new double[] {-3.560641886563089, 4.862397996498165, -16.5171573291147}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.08268422507514331, 1, 30.0);

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    CircleSketchPrimitive circleSketchPrimitive_0 = 
      faceSketch_0.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10885831715088566);

    currentView_0.setInput(new DoubleVector(new double[] {-0.014166151481506795, 0.02712262977818114, 0.497421330131953}), new DoubleVector(new double[] {-3.5610402321100563, 4.8477637215250775, -16.52121956335656}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.13316369186103588, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.12067867299194235, 0.072769049322289, 1.2173074968936628}), new DoubleVector(new double[] {-3.5625296417334713, 5.078705247734693, -16.45549345946694}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.3453673249876699, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1503198872619167, -0.11695217130643099, 1.1645875395908063}), new DoubleVector(new double[] {-3.534223351242005, 4.890798353827116, -16.514618659214317}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.16520527437824634, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.16111320741652396, -0.18663959716473033, 1.1439066423844906}), new DoubleVector(new double[] {-3.523672624912895, 4.821440643018524, -16.536463572144125}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.09755395535050869, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.02645498645964134, -0.007348562119403712, 0.49768278283797907}), new DoubleVector(new double[] {-3.523848788349376, 4.81795390872431, -16.53741449796653}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.1073093330814164, 1, 30.0);

    faceSketch_0.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_0, false);

    cadModel_0.getFeatureManager().markDependentNotUptodate(faceSketch_0);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    currentView_0.setInput(new DoubleVector(new double[] {0.2800441635701556, 0.5134492947267291, 1.4191818323374796}), new DoubleVector(new double[] {-3.4236149111173715, 5.547180608384199, -16.35174613160284}), new DoubleVector(new double[] {0.97852610979246, 0.11422003269972969, -0.17158215695270226}), 0.7216124343270665, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.40875045542784316, 0.15680049706312424, 1.6934418875095911}), new DoubleVector(new double[] {-4.281352211594737, 18.402321552516977, 1.6157084963630202}), new DoubleVector(new double[] {0.9335894486332624, 0.23884572536762871, -0.2671394034475096}), 0.7216124343270665, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.18088811927630155, 0.1460973182272236, 0.4893271497273044}), new DoubleVector(new double[] {-4.496435283268805, 18.34190425105933, 0.411805561100789}), new DoubleVector(new double[] {0.9335894486332624, 0.23884572536762871, -0.2671394034475096}), 0.7216124343270665, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.18051150211394398, 0.1482559747196608, 0.489758901144304}), new DoubleVector(new double[] {-1.3344814431385907, 17.444947056975803, 7.666110880140089}), new DoubleVector(new double[] {0.9409348101270105, 0.19674431878661203, -0.2755600771455831}), 0.7216124343270665, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.06403270490388815, 0.27209468300672124, 0.11208220889074727}), new DoubleVector(new double[] {-1.4526422211829313, 17.587988958906813, 7.296401542801666}), new DoubleVector(new double[] {0.9409348101270105, 0.19674431878661203, -0.2755600771455831}), 0.34529872173230397, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.09341571093658405, -0.1324507978284133, -0.1081349230342954}), new DoubleVector(new double[] {-1.460266601541027, 17.605957214633346, 7.25148425725231}), new DoubleVector(new double[] {0.9409348101270105, 0.19674431878661203, -0.2755600771455831}), 0.31078124583265976, 1, 30.0);

    cadModel_0.allowMakingPartDirty(false);

    FaceSketch faceSketch_1 = 
      ((FaceSketch) cadModel_0.getFeature("FaceSketch 2"));

    cadModel_0.getFeatureManager().rollBack(faceSketch_1, true);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_1);

    currentView_0.setInput(new DoubleVector(new double[] {0.16026767234098774, -0.2649762804168987, 0.18746812772163535}), new DoubleVector(new double[] {-1.3945828739288983, 17.486769470072055, 7.552621100699086}), new DoubleVector(new double[] {0.9409348101270105, 0.19674431878661203, -0.2755600771455831}), 0.6055158524138545, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.11654848770462967, -0.17454635068579893, -0.0807748524761801}), new DoubleVector(new double[] {-1.4395666598236305, 17.59163736624839, 7.290368395090743}), new DoubleVector(new double[] {0.9409348101270105, 0.19674431878661203, -0.2755600771455831}), 0.35765020053561286, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.11537201153316837, -0.232721886959895, -0.12780659406505873}), new DoubleVector(new double[] {2.2508778440366357, 10.651632093383178, 15.663424518447787}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.35765020053561286, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.04266833902108855, -0.14603182018719973, -0.4112211154379002}), new DoubleVector(new double[] {2.199318385609175, 10.846091058386115, 15.536363197436494}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.15397542751816357, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.03684367801655172, -0.08530715608110584, -0.4503957677170627}), new DoubleVector(new double[] {2.1933222949015856, 10.905941970923672, 15.495920889495029}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.09092253739285744, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.03684367801655172, -0.08530715608110584, -0.4503957677170627}), new DoubleVector(new double[] {2.1933222949015856, 10.905941970923672, 15.495920889495029}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.09092253739285744, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.03098190365494194, -0.08280393967743715, -0.4636097191288131}), new DoubleVector(new double[] {2.188572660395148, 10.914113597909553, 15.490930777707199}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.08183043545165537, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.025707199756602628, -0.07282742913370566, -0.4655603882086574}), new DoubleVector(new double[] {2.182916492420454, 10.922145843083165, 15.486159330852292}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.0736475346032334, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.1047031378670821, -0.18816910640751772, -0.39825432865311905}), new DoubleVector(new double[] {2.262049359205196, 10.807502070791887, 15.554477924444639}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.19101736861244337, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.05474038802137329, -0.0739598023589132, -0.4102361691355896}), new DoubleVector(new double[] {2.2066548909486046, 10.89402671811619, 15.502330648935564}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.12533338096035188, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.019062643372835475, -0.0014984114950047367, -0.4474696935128033}), new DoubleVector(new double[] {2.1702629520243195, 10.962847967525256, 15.459815936984018}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07401005253518163, 1, 30.0);

    CircleSketchPrimitive circleSketchPrimitive_1 = 
      faceSketch_1.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.1092778427549083);

    currentView_0.setInput(new DoubleVector(new double[] {0.019062643372835475, -0.0014984114950047367, -0.4474696935128033}), new DoubleVector(new double[] {2.1702629520243195, 10.962847967525256, 15.459815936984018}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07401005253518163, 1, 30.0);

    faceSketch_1.setCircleRadius_2(circleSketchPrimitive_1, 0.109);

    currentView_0.setInput(new DoubleVector(new double[] {0.019062643372835475, -0.0014984114950047367, -0.4474696935128033}), new DoubleVector(new double[] {2.1702629520243195, 10.962847967525256, 15.459815936984018}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07401005253518163, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.019062643372835475, -0.0014984114950047367, -0.4474696935128033}), new DoubleVector(new double[] {2.1702629520243195, 10.962847967525256, 15.459815936984018}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07401005253518163, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.019062643372835475, -0.0014984114950047367, -0.4474696935128033}), new DoubleVector(new double[] {2.1702629520243195, 10.962847967525256, 15.459815936984018}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07401005253518163, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.023770609716606605, -0.00966402807697353, -0.4382321956703845}), new DoubleVector(new double[] {2.1745864284731233, 10.952722663428045, 15.466210282305173}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.08141091342591182, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.005774283623516591, 0.06224784951637363, -0.4796299635158341}), new DoubleVector(new double[] {2.1560707732262543, 11.021987597961811, 15.420972278312409}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.03154069764461141, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.0023230389898381, 0.09105269467642185, -0.49639569241607395}), new DoubleVector(new double[] {2.152382115228205, 11.049582382695826, 15.40245097035969}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.012219539137708386, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.0017740538686755458, 0.09572453237370304, -0.4995649176940693}), new DoubleVector(new double[] {2.1518352426859932, 11.0542649878922, 15.399297366777477}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.008908045605350192, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.0019691148415307835, 0.08528330224917324, -0.4981928889214582}), new DoubleVector(new double[] {2.1525553794983754, 11.04649999082541, 15.404552126192812}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.019095184460280017, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.003500672600397381, 0.05650978039156174, -0.4800798487970839}), new DoubleVector(new double[] {2.154223897632341, 11.018424535524755, 15.423677934769291}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.059928798875167805, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.00298907617849134, 0.07051979755803695, -0.4866150121103481}), new DoubleVector(new double[] {2.147530957385499, 11.03139891615523, 15.415640249954235}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.043688160978368806, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.01992970163625382, 0.09887923431024914, -0.5049359192029603}), new DoubleVector(new double[] {2.1306867432016046, 11.060249746757322, 15.398032266556019}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.006557369474511186, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.017785072594001222, 0.09484596899776832, -0.5057606405649171}), new DoubleVector(new double[] {2.1331315360282006, 11.057746371380583, 15.399427139080446}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.017008127349155272, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.0035438972330132656, 0.08017732814603029, -0.49759549429547034}), new DoubleVector(new double[] {2.147374482533144, 11.04308675778481, 15.407605382267306}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.07815185503329819, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.038278095628002884, 0.09224120404562308, -0.5067044468830908}), new DoubleVector(new double[] {2.1131375226975004, 11.057684984286597, 15.402173314513792}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.016090803797997228, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.03889872113129769, 0.0929172420258162, -0.5064638202776528}), new DoubleVector(new double[] {2.112460511152777, 11.058073631043074, 15.401996988377563}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.014481723569688484, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.0404599082891095, 0.09536283018383473, -0.506284253771915}), new DoubleVector(new double[] {2.110749535674601, 11.059755770524832, 15.401068928788895}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.009501459094835261, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.028632751702413972, 0.08496753374442756, -0.5018787273877625}), new DoubleVector(new double[] {2.122681751846344, 11.049895947084506, 15.406251329749}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.05811004842104673, 1, 30.0);

    faceSketch_1.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_1, false);

    cadModel_0.getFeatureManager().markDependentNotUptodate(faceSketch_1);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    LoftMerge loftMerge_1 = 
      (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}), new NeoObjectVector(new Object[] {}));

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    currentView_0.setInput(new DoubleVector(new double[] {-0.2640959161779677, 0.4277584344454042, -0.7141019898207339}), new DoubleVector(new double[] {1.8879241788571883, 11.396283142109088, 15.199245640624948}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.3553396945737725, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.9272612157476688, 0.8769289427412075, -1.039527767759868}), new DoubleVector(new double[] {1.2343134309226402, 11.894151771729415, 14.944472038273776}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 1.0130166746631322, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-3.0796252544030036, 2.4554105409411155, -3.3454230037268156}), new DoubleVector(new double[] {-0.7814044048417983, 14.169098638109237, 13.649022073705513}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 2.8592391469411513, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.1976521990657385, -1.0245807712295019, -2.3313194785575595}), new DoubleVector(new double[] {2.1906530437734304, 11.148254011289655, 15.329264483738001}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.3934421905689647, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.15805686752271114, -0.8851163761835812, -2.0346970584417354}), new DoubleVector(new double[] {2.1941976922300714, 11.103973464049279, 15.359306190415214}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.35411188592826526, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.1253594344754867, -1.015633903773998, -1.644267030697705}), new DoubleVector(new double[] {2.199285546494414, 10.832734040902734, 15.545574172407061}), new DoubleVector(new double[] {0.9411060443012119, 0.20521175051873172, -0.2687146271210474}), 0.35411188592826526, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.08300498901403647, -0.813115461026612, -1.3465222584226542}), new DoubleVector(new double[] {4.315045239540684, 8.841570639296535, 16.413034052501335}), new DoubleVector(new double[] {0.9305168788890205, 0.17144777008319292, -0.3236417776433947}), 0.35411188592826526, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.05139764962623358, -0.7755158452700089, -1.264781034088835}), new DoubleVector(new double[] {-2.1633257329524613, 11.689100848487382, 14.896712982163281}), new DoubleVector(new double[] {0.9444699909132483, 0.30811064643011854, -0.11421149600973945}), 0.35411188592826526, 1, 30.0);

    loftMerge_1.setAutoPreview(true);

    cadModel_0.getFeatureManager().deleteOnCancel(loftMerge_1);

    cadModel_0.allowMakingPartDirty(true);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);

    cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.9469386009285142, 1.040831010597256, -0.43169523573532875}), new DoubleVector(new double[] {-2.868274356820597, 12.380570240489442, 14.271294211308552}), new DoubleVector(new double[] {0.9444699909132483, 0.30811064643011854, -0.11421149600973945}), 1.1096899690653819, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.030348329158080695, -0.06791983643034216, 0.4779408487836889}), new DoubleVector(new double[] {-1.9569754270881778, 11.30304893712866, 15.221422201475525}), new DoubleVector(new double[] {0.9444699909132483, 0.30811064643011854, -0.11421149600973945}), 0.20643363590390942, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.030142103743161425, -0.07444509492699278, 0.46857442861169474}), new DoubleVector(new double[] {1.2235270254780208, 9.848619037277306, 16.290779718318902}), new DoubleVector(new double[] {0.9468303027132645, 0.23342462001801337, -0.22141663133873365}), 0.20643363590390942, 1, 30.0);

    faceSketch_0.deleteSketchPrimitives(new NeoObjectVector(new Object[] {circleSketchPrimitive_0}));

    currentView_0.setInput(new DoubleVector(new double[] {-0.008771308458726423, 0.1325353408671891, 0.7916819233871724}), new DoubleVector(new double[] {1.2191613466527345, 9.851889676622857, 16.289074415757483}), new DoubleVector(new double[] {0.9468303027132645, 0.23342462001801337, -0.22141663133873365}), 0.22707690831247515, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.009154006263226114, 0.14798278340994964, 0.7808805010797502}), new DoubleVector(new double[] {1.2188433971103751, 9.867849615758768, 16.279090163045975}), new DoubleVector(new double[] {0.9468303027132645, 0.23342462001801337, -0.22141663133873365}), 0.20437054782686812, 1, 30.0);

    cadModel_0.getFeatureManager().cancelSketchEdit(faceSketch_0);

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(true);

    cadModel_0.getFeatureManager().delete(faceSketch_0, faceSketch_1);

    currentView_0.setInput(new DoubleVector(new double[] {-0.04230355449899507, 0.5141971881243741, 0.8589510769668531}), new DoubleVector(new double[] {-3.4889843942623413, 15.304888161013963, -9.4140302057538}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.20437054782686812, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.11031793632076803, 0.20675758802223587, 0.5281031972364434}), new DoubleVector(new double[] {-3.5663698645039865, 15.037662575304726, -9.772809019739984}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.20437054782686812, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.11031793632076803, 0.20675758802223587, 0.5281031972364434}), new DoubleVector(new double[] {-3.5663698645039865, 15.037662575304726, -9.772809019739984}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.20437054782686812, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.11031793632076803, 0.20675758802223587, 0.5281031972364434}), new DoubleVector(new double[] {-3.5663698645039865, 15.037662575304726, -9.772809019739984}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.20437054782686812, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.11031793632076803, 0.20675758802223587, 0.5281031972364434}), new DoubleVector(new double[] {-3.5663698645039865, 15.037662575304726, -9.772809019739984}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.20437054782686812, 1, 30.0);

    FillFeature fillFeature_0 = 
      ((FillFeature) cadModel_0.getFeature("Fill Surface 1"));

    Face face_3 = 
      ((Face) fillFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.01567755819841113, -0.003170289009157421, 0.508000000000002})));

    Sketch sketch_0 = 
      cadModel_0.getFeatureManager().createSketch(face_3);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().startSketchEdit(sketch_0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10158253199555606, 0.0822183217932102, 0.7372715983400429}), new DoubleVector(new double[] {-3.5988590251450634, 15.090029680525532, -9.686512217132307}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.32913181130365027, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {-0.036625879617206536, 0.01403967008097129, 0.5763242755159339}), new DoubleVector(new double[] {-3.5295848790015043, 15.003323431096135, -9.83459106309411}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.10329142303505577, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.02753689590370123, -0.003906943614797598, 0.5402357943830545}), new DoubleVector(new double[] {-3.4666099126956915, 14.99047404567649, -9.874219860955279}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.10329142303505577, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.02753689590370123, -0.003906943614797598, 0.5402357943830545}), new DoubleVector(new double[] {-3.4666099126956915, 14.99047404567649, -9.874219860955279}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.10329142303505577, 1, 30.0);

    CircleSketchPrimitive circleSketchPrimitive_2 = 
      sketch_0.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10967945127114238);

    currentView_0.setInput(new DoubleVector(new double[] {0.02753689590370123, -0.003906943614797598, 0.5402357943830545}), new DoubleVector(new double[] {-3.4666099126956915, 14.99047404567649, -9.874219860955279}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.10329142303505577, 1, 30.0);

    sketch_0.setCircleRadius_2(circleSketchPrimitive_2, 0.109);

    currentView_0.setInput(new DoubleVector(new double[] {0.04520716633461386, 0.02583251590941016, 0.578165619850822}), new DoubleVector(new double[] {-3.4490492317917205, 15.020683785131514, -9.836616671811383}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.15122776753621262, 1, 30.0);

    sketch_0.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(sketch_0, true);

    sketch_0.setIsUptoDate(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    currentView_0.setInput(new DoubleVector(new double[] {0.06291778963985606, 0.014517510576308679, 0.6566066621666478}), new DoubleVector(new double[] {-3.4419420191813828, 15.054871040709148, -9.789779553579585}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.22141030325271305, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.05038022659031416, -0.26867435402502604, 0.253082806901622}), new DoubleVector(new double[] {-3.4544795552128784, 14.771679060165672, -10.193303328316153}), new DoubleVector(new double[] {0.9641011631018468, 0.04262749428841219, -0.2620912895088212}), 0.22141030325271305, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.019106679761999056, -0.08186511187027332, 0.28405489801323036}), new DoubleVector(new double[] {-0.8836893271581577, 11.206449664043735, 15.09561001858378}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.01981054246651992, 0.1447531014043708, 0.11138554680355739}), new DoubleVector(new double[] {-0.8829854627191039, 11.433067855630252, 14.922940638916815}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);
  
  }

  private void execute2() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_0 = 
      simulation_0.getSceneManager().getScene("3D-CAD View 1");

    CurrentView currentView_0 = 
      scene_0.getCurrentView();

    currentView_0.setInput(new DoubleVector(new double[] {0.01981054246651992, 0.1447531014043708, 0.11138554680355739}), new DoubleVector(new double[] {-0.8829854627191039, 11.433067855630252, 14.922940638916815}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.01981054246651992, 0.1447531014043708, 0.11138554680355739}), new DoubleVector(new double[] {-0.8829854627191039, 11.433067855630252, 14.922940638916815}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);

    CadModel cadModel_0 = 
      ((CadModel) simulation_0.get(SolidModelManager.class).getObject("3D-CAD Model 1"));

    BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
      ((BodyCircularPatternMerge) cadModel_0.getFeature("Circular Pattern 1"));

    star.cadmodeler.Body cadmodelerBody_1 = 
      ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));

    Face face_4 = 
      ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.01567755819841113, 0.0031702890091573656, -0.508000000000002})));

    Sketch sketch_1 = 
      cadModel_0.getFeatureManager().createSketch(face_4);

    cadModel_0.allowMakingPartDirty(false);

    cadModel_0.getFeatureManager().startSketchEdit(sketch_1);

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    currentView_0.setInput(new DoubleVector(new double[] {0.01981054246651992, 0.1447531014043708, 0.11138554680355739}), new DoubleVector(new double[] {-0.8829854627191039, 11.433067855630252, 14.922940638916815}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);

    CircleSketchPrimitive circleSketchPrimitive_3 = 
      sketch_1.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10816653826391967);

    currentView_0.setInput(new DoubleVector(new double[] {0.01981054246651992, 0.1447531014043708, 0.11138554680355739}), new DoubleVector(new double[] {-0.8829854627191039, 11.433067855630252, 14.922940638916815}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.22141030325271305, 1, 30.0);

    sketch_1.setCircleRadius_2(circleSketchPrimitive_3, 0.109);

    sketch_1.markFeatureForEdit();

    cadModel_0.allowMakingPartDirty(true);

    cadModel_0.getFeatureManager().stopSketchEdit(sketch_1, true);

    sketch_1.setIsUptoDate(true);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    Sketch sketch_0 = 
      ((Sketch) cadModel_0.getFeature("Sketch 1"));

    LoftMerge loftMerge_2 = 
      (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {sketch_0, sketch_1}), new NeoObjectVector(new Object[] {}));

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    loftMerge_2.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));

    cadModel_0.allowMakingPartDirty(true);

    loftMerge_2.setProfileSketches(new NeoObjectVector(new Object[] {sketch_0, sketch_1}));

    loftMerge_2.setLoftedBodyTypeOption(0);

    loftMerge_2.setGuideSketches(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setProfileAlignmentType(0);

    loftMerge_2.setBoundaryContactTypeStart(0);

    loftMerge_2.setBoundaryContactTypeEnd(0);

    loftMerge_2.setProfileSortingType(0);

    loftMerge_2.setSectionProfileType(0);

    loftMerge_2.setRefitType(0);

    loftMerge_2.setTolerance(1.0E-5);

    loftMerge_2.setPeriodicity(false);

    loftMerge_2.setCompatibilityMode(false);

    loftMerge_2.setPostOption(1);

    loftMerge_2.setInteractingBodies(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingSelectedBodies(false);

    loftMerge_2.markFeatureForEdit();

    cadModel_0.getFeatureManager().execute(loftMerge_2);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_0.setInput(new DoubleVector(new double[] {-0.10340635048411227, 0.6432707439146017, 0.05183305981887987}), new DoubleVector(new double[] {-0.9935895112565863, 11.77387793534235, 14.656457861123847}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.5219239365639081, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.024010596175429444, 0.10994663215656808, -0.5085085965979337}), new DoubleVector(new double[] {-0.9036607469669978, 11.70929582036447, 14.711159110619747}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.20221022397018565, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.02816373449161781, 0.08483293119425839, -0.6227226404523543}), new DoubleVector(new double[] {-0.9046469905236793, 11.748443547111057, 14.681263381547602}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.06345597161615403, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.023581358067156513, 0.15009435275988325, -0.5145551718846051}), new DoubleVector(new double[] {-0.9031445839397623, 11.73762250329668, 14.689601987078214}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.05139941904025104, 1, 30.0);

    cadModel_0.getFeatureManager().rollBack(loftMerge_2, true);

    cadModel_0.allowMakingPartDirty(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);

    loftMerge_2.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));

    cadModel_0.allowMakingPartDirty(true);

    loftMerge_2.setProfileSketches(new NeoObjectVector(new Object[] {sketch_0, sketch_1}));

    loftMerge_2.setLoftedBodyTypeOption(0);

    loftMerge_2.setGuideSketches(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setProfileAlignmentType(0);

    loftMerge_2.setBoundaryContactTypeStart(0);

    loftMerge_2.setBoundaryContactTypeEnd(0);

    loftMerge_2.setProfileSortingType(0);

    loftMerge_2.setSectionProfileType(0);

    loftMerge_2.setRefitType(0);

    loftMerge_2.setTolerance(1.0E-5);

    loftMerge_2.setPeriodicity(false);

    loftMerge_2.setCompatibilityMode(false);

    loftMerge_2.setPostOption(1);

    loftMerge_2.setInteractingBodies(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));

    loftMerge_2.setInteractingSelectedBodies(false);

    loftMerge_2.markFeatureForEdit();

    cadModel_0.getFeatureManager().markDependentNotUptodate(loftMerge_2);

    cadModel_0.getFeatureManager().rollForwardToEnd(false);

    scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);

    currentView_0.setInput(new DoubleVector(new double[] {0.07334972423603099, -0.02854597145210569, -0.5137585440480676}), new DoubleVector(new double[] {-0.8586993442366657, 11.625541099014667, 14.77773150125594}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.314349214296174, 1, 30.0);

    currentView_0.setInput(new DoubleVector(new double[] {0.05921794668941861, -0.04348344879424659, -0.4387242349698872}), new DoubleVector(new double[] {-0.8703496013953865, 11.579575368283447, 14.812053206682426}), new DoubleVector(new double[] {0.9126419451043124, 0.35001371973860246, -0.21112810336618784}), 0.5568851484778888, 1, 30.0);

    star.cadmodeler.Body cadmodelerBody_2 = 
      ((star.cadmodeler.Body) loftMerge_2.getBodyByLocation(new DoubleVector(new double[] {-0.098639865319869, 0.04628044824200296, -0.508000000000002})));

    cadmodelerBody_2.getUnNamedFacesDefaultAttributeName();

    cadmodelerBody_2.getUnNamedFacesDefaultAttributeName();

    cadmodelerBody_2.getUnNamedEdgesDefaultAttributeName();

    cadmodelerBody_2.getUnNamedEdgesDefaultAttributeName();
  }
}
