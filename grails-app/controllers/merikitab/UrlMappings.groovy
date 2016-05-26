package merikitab

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/api/board"(resources:'Board')
        "/api/franchise"(resources:'Franchise')
        "/api/school"(resources:'School')
        "/api/classroom"(resources:'Classroom')
        "/api/section"(resources:'Section')
        "/api/society"(resources:'Society')
        "/api/societypost"(resources:'Societypost')
        "/api/std"(resources:'Std')

        "/api/answer"(resources:'Answer')
        "/api/comment"(resources:'Comment')
        "/api/doubt"(resources:'Doubt')
    }
}
