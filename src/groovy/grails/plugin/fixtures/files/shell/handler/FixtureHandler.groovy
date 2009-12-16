package grails.plugin.fixtures.files.shell.handler

class FixtureHandler extends FixtureBuildingShellHandler {

    final name = 'fixture'
    
    FixtureHandler(fileLoader) {
        super(fileLoader)
    }
    
    def doCall(Closure f) {
        builder.beans(f)
    }

}