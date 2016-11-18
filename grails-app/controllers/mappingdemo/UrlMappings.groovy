package mappingdemo

class UrlMappings {

    static mappings = {
        "/api/home"(controller: 'demo') {
                 action = [POST: 'createHome']
        }
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
